package cdg.hscc.gmds.data.rest.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cdg.hscc.gmds.data.dto.UnitDto;
import cdg.hscc.gmds.data.service.IUnitService;
import cdg.hscc.gmds.data.service.UnitService;

@RestController
@RequestMapping("/api/units")
public class UnitController {

	private IUnitService unitService;
	public UnitController(UnitService unitService) {
		super();
		this.unitService = unitService;
	}
	
	@GetMapping
	public ResponseEntity<List<UnitDto>> findAll() {
		return ResponseEntity.ok(unitService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UnitDto> findTroopById(@PathVariable("id")long id) {
		return ResponseEntity.ok(unitService.findById(id));
	}
	
	@GetMapping("/reserves")
	public ResponseEntity<List<UnitDto>> findAllReserves() {
		return ResponseEntity.ok(unitService.findAllActiveReserveUnits());
	}

	@GetMapping("/troops")
	public ResponseEntity<List<UnitDto>> findAllTroops() {
		return ResponseEntity.ok(unitService.findAllTroops());

	}
	
	@GetMapping("/troops/status/active")
	public ResponseEntity<List<UnitDto>> findAllActiveReserveTroops() {
		return ResponseEntity.ok(unitService.findAllActiveReserveTroops());

	}
	
	@GetMapping("/troops/status/inactive")
	public ResponseEntity<List<UnitDto>> findAllInactiveReserveTroops() {
		return ResponseEntity.ok(unitService.findAllActiveInactiveReserveTroops());
	}

	@GetMapping("/equipment")
	public ResponseEntity<List<UnitDto>> findAllEquipment() {
		return ResponseEntity.ok(unitService.findAllEquipment());

	}

	@GetMapping("/equipment/status/active")
	public ResponseEntity<List<UnitDto>> findAllActiveReserveEquipment() {
		return ResponseEntity.ok(unitService.findAllActiveReserveEquipment());

	}
	
	@GetMapping("/equipment/status/inactive")
	public ResponseEntity<List<UnitDto>> findAllInactiveReserveEquipment() {
		return ResponseEntity.ok(unitService.findAllActiveInactiveReserveEquipment());
	}
	
}
