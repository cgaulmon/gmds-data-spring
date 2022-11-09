package cdg.hscc.gmds.data.service;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdg.hscc.gmds.data.dto.DeploymentDto;
import cdg.hscc.gmds.data.dto.UnitDto;
import cdg.hscc.gmds.data.entity.Deployment;
import cdg.hscc.gmds.data.repository.DeploymentRepository;

@Service
public class DeploymentService implements IDeploymentService {

	private DeploymentRepository deploymentRepository;
	private IUnitService unitService;
	private ICountryService countryService;
	@Autowired
	private ModelMapper modelMapper;

	public DeploymentService(DeploymentRepository deploymentRepository, UnitService unitService, CountryService countryService) {
		super();
		this.deploymentRepository = deploymentRepository;
		this.countryService = countryService;
		this.unitService = unitService;
	}

	@Override
	@Transactional
	public void deploy(DeploymentDto deployment) {
		
		int unitId = deployment.getUnitId();
		
		UnitDto unit = unitService.findById(unitId);
		if (unitService.findById(unitId) == null) {
			throw new IllegalArgumentException("Unit " + unit.getUnitId() + " does not exist!");
		}

		int countryId = deployment.getCountryId();
		if (countryService.findById(countryId) == null) {
			throw new IllegalArgumentException("Country " + countryId + " does not exist!");
		}

		Deployment entity = findByCountryAndUnit(countryId, unitId);
		int qty = deployment.getUnitQty();
		if(entity != null) {
			entity.setUnitQty(entity.getUnitQty() + qty);
		} else {
			entity = convertToEntity(deployment);
			entity.setLoadDate(Date.from(Instant.now()));
			entity.setLoadDtm(Date.from(Instant.now()));
		}
		save(entity);

		unit.setQty(unit.getQty() - qty);
		unitService.save(unit);

	}

	private Deployment save(Deployment entity) {
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

	@Override
	public List<DeploymentDto> findAllByUserId(int userId) {
		return deploymentRepository.findAllByUserId(userId)
					.stream()
					.map(this::convertToDTO)
					.collect(Collectors.toList());
	}

	@Override
	public DeploymentDto convertToDTO(Deployment deployment) {
		return modelMapper.map(deployment, DeploymentDto.class);
	}

	@Override
	public Deployment convertToEntity(DeploymentDto deployment) {
		return modelMapper.map(deployment, Deployment.class);
	}

}
