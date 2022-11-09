package cdg.hscc.gmds.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cdg.hscc.gmds.data.entity.Deployment;

public interface DeploymentRepository extends JpaRepository<Deployment, Long>{

	Optional<Deployment> findByCountryIdAndUnitId(int countryId, int unitId);

	List<Deployment> findAllByUserId(int userId);


}
