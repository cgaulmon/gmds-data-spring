package cdg.hscc.gmds.data.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdg.hscc.gmds.data.dto.CountryDto;
import cdg.hscc.gmds.data.dto.ManageCountryDto;
import cdg.hscc.gmds.data.entity.Country;
import cdg.hscc.gmds.data.entity.VCountryDeploymentDetail;
import cdg.hscc.gmds.data.entity.VCountryDeployments;
import cdg.hscc.gmds.data.repository.CountryRepository;

@Service
public class CountryService implements ICountryService {

	private CountryRepository countryRepository;
	@Autowired
	private ModelMapper mapper;
	
	public CountryService(CountryRepository countryRepository) {
		super();
		this.countryRepository = countryRepository;
	}
	@Override
	public CountryDto findById(int id) {
		Optional<Country> countryOptional = countryRepository.findById(id);
		if(countryOptional.isPresent()) {
			return convertToDto(countryOptional.get());
		}
		return null;
	}
	@Override
	public List<CountryDto> findAll() {
		return countryRepository.findAll()
				.stream()
				.map(this::convertToDto)
				.collect(Collectors.toList());
	}
	@Override
	public Country convertToEntity(CountryDto countryDto) {
		return mapper.map(countryDto, Country.class);
	}
	@Override
	public CountryDto convertToDto(Country country) {
		return mapper.map(country, CountryDto.class);
	}
	@Override
	public CountryDto save(CountryDto countryDto) {
		return convertToDto(countryRepository.save(convertToEntity(countryDto)));
	}
	
	@Override
	public List<ManageCountryDto> manage() {
		return countryRepository.findManageCountryList().stream()
				.map(ManageCountryDto::new)
				.collect(Collectors.toList());
	}
	@Override
	public List<VCountryDeployments> findAllDeployments() {
		return countryRepository.findAllDeployments();
	}
	@Override
	public List<VCountryDeploymentDetail> findDeploymentDetailsByCountryId(long countryId) {
		return countryRepository.findAllDeploymentDetailsByCountryId(countryId);
	}
	

}
