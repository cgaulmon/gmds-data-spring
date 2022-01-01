package cdg.hscc.gmds.data.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cdg.hscc.gmds.data.dto.CountryDeploymentsDto;
import cdg.hscc.gmds.data.dto.CountryDto;
import cdg.hscc.gmds.data.dto.ManageCountryDto;
import cdg.hscc.gmds.data.service.CountryService;
import cdg.hscc.gmds.data.service.ICountryService;


@RestController
@RequestMapping("/countries")
public class CountryController {

	private ICountryService countryService;
	
	public CountryController(CountryService countryService) {
		super();
		this.countryService = countryService;
	}



	@GetMapping
	public ResponseEntity<List<CountryDto>> findAll() {
		return ResponseEntity.ok(countryService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CountryDto> findById(@PathVariable("id")int id) {
		return ResponseEntity.ok(countryService.findById(id));
	}
	
	@GetMapping("/manage")
	public ResponseEntity<List<ManageCountryDto>> manageCountries() {
		return ResponseEntity.ok(countryService.manage());
	}
	
	@GetMapping("/deployments")
	public ResponseEntity<List<CountryDeploymentsDto>> findAllDeployments() {
		return ResponseEntity.ok(countryService.findAllDeployments());
	}
}
