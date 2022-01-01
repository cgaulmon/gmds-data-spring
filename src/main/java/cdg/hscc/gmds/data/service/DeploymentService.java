package cdg.hscc.gmds.data.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import cdg.hscc.gmds.data.dto.UnitDto;
import cdg.hscc.gmds.data.entity.Deployment;
import cdg.hscc.gmds.data.repository.DeploymentRepository;

@Service
public class DeploymentService implements IDeploymentService {

	private DeploymentRepository deploymentRepository;
	private IUnitService unitService;
	private ICountryService countryService;

	public DeploymentService(DeploymentRepository deploymentRepository, UnitService unitService, CountryService countryService) {
		super();
		this.deploymentRepository = deploymentRepository;
		this.countryService = countryService;
		this.unitService = unitService;
	}

	@Override
	@Transactional
	public void deploy(int unitId, int countryId, int qty) {
		UnitDto unit = unitService.findById(unitId);
		if (unitService.findById(unitId) == null) {
			throw new IllegalArgumentException("Unit " + unit.getUnitId() + " does not exist!");
		}

		if (countryService.findById(countryId) == null) {
			throw new IllegalArgumentException("Country " + countryId + " does not exist!");
		}

		Deployment entity = findByCountryAndUnit(countryId, unitId);
		if(entity != null) {
			entity.setUnitQty(entity.getUnitQty() + qty);
		} else {
			entity = new Deployment();
			entity.setCountryId(countryId);
			entity.setUnitId(unitId);
			entity.setUnitQty(qty);
		}
		save(entity);

		unit.setQty(unit.getQty() - qty);
		unitService.save(unit);

	}

	public Deployment save(Deployment entity) {
		return deploymentRepository.save(entity);
	}

	@Override
	@Transactional
	public void transfer(int unitId, int fromCountryId, int toCountryId, int qty) {
		Deployment fromDeployment = findByCountryAndUnit(fromCountryId, unitId);
		if (fromDeployment != null) {
			int beginQty = fromDeployment.getUnitQty();
			if (beginQty - qty <= 0) {
				//dont allow
			} else {
				fromDeployment.setUnitQty(beginQty - qty);
				Deployment toDeployment = findByCountryAndUnit(toCountryId, unitId);
				if (toDeployment != null) {
					toDeployment.setUnitQty(toDeployment.getUnitQty() + qty);
				} else {
					toDeployment = new Deployment();
					toDeployment.setCountryId(toCountryId);
					toDeployment.setUnitId(unitId);
					toDeployment.setUnitQty(qty);
				}
				save(toDeployment);
			}
			save(fromDeployment);
		}
		
	}

	@Override
	public void returnToReserve(int unitId, int countryId, int qty) {
		Deployment deployment = findByCountryAndUnit(countryId, unitId);
		if(deployment != null) {
			int deploymentQty = deployment.getUnitQty();
			if(deploymentQty - qty <= 0) {
				delete(deployment);
			} else {
				UnitDto unit = unitService.findByUnitId(unitId);
				unit.setQty(unit.getQty() + qty);
				unitService.save(unit);
				
			}
		}
		
	}

	private void delete(Deployment deployment) {
		deploymentRepository.delete(deployment);
		
	}

	private Deployment findByCountryAndUnit(int countryId, int unitId) {
		Optional<Deployment> optionalDeployment = deploymentRepository.findByCountryIdAndUnitId(countryId, unitId);
		if(optionalDeployment.isPresent()) {
			return optionalDeployment.get();
		} else {
			return null;
		}
	}

}
