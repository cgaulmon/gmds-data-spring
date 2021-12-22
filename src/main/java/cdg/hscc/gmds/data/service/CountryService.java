package cdg.hscc.gmds.data.service;

import org.springframework.stereotype.Service;

import cdg.hscc.gmds.data.dto.CountryDto;
import cdg.hscc.gmds.data.repository.CountryRepository;

@Service
public class CountryService implements ICountryService {

	private CountryRepository countryRepository;
	@Override
	public CountryDto findById(int countryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
