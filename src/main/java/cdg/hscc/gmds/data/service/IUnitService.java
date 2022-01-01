package cdg.hscc.gmds.data.service;

import java.util.List;

import cdg.hscc.gmds.data.dto.UnitDto;
import cdg.hscc.gmds.data.entity.Unit;

public interface IUnitService {

	List<UnitDto> findAll();
	UnitDto findById(long id);
	List<UnitDto> findAllActiveReserveUnits();
	List<UnitDto> findAllInactiveReserveUnits();
	Unit convertToEntity(UnitDto unitDto);
	UnitDto convertToDto(Unit unit);
	UnitDto save(UnitDto unit);
	List<UnitDto> findAllTroops();
	List<UnitDto> findAllEquipment();
	List<UnitDto> findAllActiveReserveEquipment();
	List<UnitDto> findAllActiveReserveTroops();
	List<UnitDto> findAllActiveInactiveReserveEquipment();
	List<UnitDto> findAllActiveInactiveReserveTroops();
	UnitDto findByUnitId(int unitId);
	
	
	
}
