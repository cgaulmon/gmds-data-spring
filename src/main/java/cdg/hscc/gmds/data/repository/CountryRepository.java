package cdg.hscc.gmds.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cdg.hscc.gmds.data.dto.CountryDeploymentsDto;
import cdg.hscc.gmds.data.entity.Country;
import cdg.hscc.gmds.data.entity.VManageCountry;

public interface CountryRepository extends JpaRepository<Country, Long> {

	Optional<Country> findById(long id);
	Optional<Country> findByCountryId(int countryId);
	List<Country> findAllByStatus(String status);
	Optional<Country> findByName(String name);
	@Query("select v from VManageCountry v")
	List<VManageCountry> findManageCountryList();
	@Query("select m from VCountryDeployments m")
	List<CountryDeploymentsDto> findAllDeployments();
	
}
