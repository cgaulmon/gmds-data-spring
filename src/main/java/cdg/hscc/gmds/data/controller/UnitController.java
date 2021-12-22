package cdg.hscc.gmds.data.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cdg.hscc.gmds.data.dto.UnitDto;
import cdg.hscc.gmds.data.service.EquipmentService;
import cdg.hscc.gmds.data.service.IUnitService;
import cdg.hscc.gmds.data.service.TroopService;

@RestController
@RequestMapping("/units")
public class UnitController {

	private IUnitService troopService;
	private IUnitService equipmentService;

	public UnitController(TroopService troopService, EquipmentService equipmentService) {
		super();
		this.troopService = troopService;
		this.equipmentService = equipmentService;
	}

	@GetMapping("/troops")
	public ResponseEntity<List<UnitDto>> findAllTroops() {
		return ResponseEntity.ok(troopService.findAll());

	}
	
	@GetMapping("/troops/{id}")
	public ResponseEntity<UnitDto> findTroopById(@PathVariable("id")long id) {
		return ResponseEntity.ok(troopService.findById(id));
	}

	@GetMapping("/equipment")
	public ResponseEntity<List<UnitDto>> findAllEquipment() {
		return ResponseEntity.ok(equipmentService.findAll());

	}
	
	@GetMapping("/equipment/{id}")
	public ResponseEntity<UnitDto> findEquipmentById(@PathVariable("id")long id) {
		return ResponseEntity.ok(troopService.findById(id));
	}
}
