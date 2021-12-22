package cdg.hscc.gmds.data.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdg.hscc.gmds.data.dto.UnitDto;
import cdg.hscc.gmds.data.entity.Unit;
import cdg.hscc.gmds.data.repository.UnitRepository;

@Service
public class TroopService implements IUnitService {
	
	private UnitRepository unitRepository;

	@Autowired
	private ModelMapper mapper;
	
	public TroopService(UnitRepository unitRepository) {
		super();
		this.unitRepository = unitRepository;
	}

	@Override
	public List<UnitDto> findAll() {
		return findAllActiveReserveUnits();
	}

	@Override
	public UnitDto findById(long id) {
		Optional<Unit> unitOptional = unitRepository.findById(id);
		if(unitOptional.isPresent()) {
			return this.convertToDto(unitOptional.get());
		}
		return null;
	}

	@Override
	public List<UnitDto> findAllActiveReserveUnits() {
		return unitRepository.findAllActiveReserveTroops()
				.stream()
				.map(this::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public List<UnitDto> findAllInactiveReserveUnits() {
		return unitRepository.findAllInactiveReserveTroops()
				.stream()
				.map(this::convertToDto)
				.collect(Collectors.toList());
	}

	@Override
	public Unit convertToEntity(UnitDto unitDto) {
		return this.mapper.map(unitDto, Unit.class);
	}

	@Override
	public UnitDto convertToDto(Unit unit) {
		return this.mapper.map(unit, UnitDto.class);
	}

	@Override
	public UnitDto save(UnitDto unitDto) {
		return convertToDto(unitRepository.save(convertToEntity(unitDto)));
	}

}
