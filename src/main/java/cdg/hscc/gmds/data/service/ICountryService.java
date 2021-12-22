package cdg.hscc.gmds.data.service;

import cdg.hscc.gmds.data.dto.CountryDto;

public interface ICountryService {

	CountryDto findById(int countryId);

}
