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
	
	
	
}
