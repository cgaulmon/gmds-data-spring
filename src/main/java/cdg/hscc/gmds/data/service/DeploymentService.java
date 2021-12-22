package cdg.hscc.gmds.data.service;

import org.springframework.stereotype.Service;

import cdg.hscc.gmds.data.dto.UnitDto;
import cdg.hscc.gmds.data.entity.Deployment;
import cdg.hscc.gmds.data.repository.DeploymentRepository;

@Service
public class DeploymentService implements IDeploymentService {

	private DeploymentRepository deploymentRepository;
	private IUnitService troopService;
	private IUnitService equipmentService;
	private ICountryService countryService;

	public DeploymentService(DeploymentRepository deploymentRepository, TroopService troopService,
			EquipmentService equipmentService, CountryService countryService) {
		super();
		this.deploymentRepository = deploymentRepository;
		this.troopService = troopService;
		this.equipmentService = equipmentService;
		this.countryService = countryService;
	}

	@Override
	public void deploy(int unitId, String unitType, int countryId, int qty) {
		IUnitService unitService = getUnitServiceByUnitType(unitType);

		if (unitService.findById(unitId) == null) {
			throw new IllegalArgumentException("Unit " + unitId + " does not exist!");
		}

		if (countryService.findById(countryId) == null) {
			throw new IllegalArgumentException("Country " + countryId + " does not exist!");
		}

		Deployment entity = new Deployment();
		entity.setCountryId(countryId);
		entity.setUnitId(unitId);
		entity.setUnitQty(qty);
		deploymentRepository.save(entity);

		UnitDto unit = unitService.findById(unitId);
		unit.setQty(unit.getQty() - qty);
		unitService.save(unit);

	}

	private IUnitService getUnitServiceByUnitType(String unitType) {
		if (unitType.equalsIgnoreCase("T")) {
			return troopService;
		}
		return equipmentService;
	}

}
