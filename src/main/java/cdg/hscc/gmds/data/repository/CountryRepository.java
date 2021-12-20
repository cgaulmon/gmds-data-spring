package cdg.hscc.gmds.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cdg.hscc.gmds.data.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

	Optional<Country> findById(long id);
	Optional<Country> findByCountryId(int countryId);
	List<Country> findAllByStatus(String status);
	Optional<Country> findByName(String name);
	
}
