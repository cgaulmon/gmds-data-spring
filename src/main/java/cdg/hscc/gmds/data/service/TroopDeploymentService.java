package cdg.hscc.gmds.data.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import cdg.hscc.gmds.data.dto.UnitDto;
import cdg.hscc.gmds.data.entity.Deployment;
import cdg.hscc.gmds.data.repository.DeploymentRepository;

@Service
public class TroopDeploymentService implements UnitDeploymentService {
	private IUnitService unitService;
	private DeploymentRepository deploymentRepository;

	public TroopDeploymentService(UnitService unitService, DeploymentRepository deploymentRepository) {
		super();
		this.unitService = unitService;
		this.deploymentRepository = deploymentRepository;
	}

	@Override
	@Transactional
	public void deploy(int unitId, int countryId, int qty) {
		UnitDto unit = unitService.findById(unitId);
		Deployment entity = new Deployment();
		entity.setCountryId(countryId);
		entity.setUnitQty(qty);
		entity.setUnitId(unitId);
		deploymentRepository.save(entity);
		unit.setQty(unit.getQty() - qty);
		unitService.save(unit);
	}

	@Override
	public void transfer(int unitId, int fromCountryId, int toCountryId, int qty) {
		// TODO Auto-generated method stub

	}

	@Override
	public void returnToReserve(int unitId, int countryId, int qty) {
		// TODO Auto-generated method stub

	}

}
