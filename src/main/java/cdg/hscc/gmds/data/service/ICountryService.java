package cdg.hscc.gmds.data.service;

import java.util.List;

import cdg.hscc.gmds.data.dto.CountryDto;
import cdg.hscc.gmds.data.dto.ManageCountryDto;
import cdg.hscc.gmds.data.entity.Country;
import cdg.hscc.gmds.data.entity.VCountryDeploymentDetail;
import cdg.hscc.gmds.data.entity.VCountryDeployments;

public interface ICountryService {

	CountryDto findById(int countryId);

	List<CountryDto> findAll();

	Country convertToEntity(CountryDto countryDto);

	CountryDto convertToDto(Country country);
	
	CountryDto save(CountryDto country);
	
	List<ManageCountryDto> manage();
	
	List<VCountryDeployments> findAllDeployments();

	List<VCountryDeploymentDetail> findDeploymentDetailsByCountryId(long countryId);

}
