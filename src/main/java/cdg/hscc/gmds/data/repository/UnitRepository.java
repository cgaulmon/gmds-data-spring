package cdg.hscc.gmds.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cdg.hscc.gmds.data.entity.Unit;

public interface UnitRepository extends JpaRepository<Unit, Long> {

	Optional<Unit> findById(long id);	
	@Query("select u from Unit u where u.qty > 0 and UPPER(u.status) = 'A'")
	List<Unit> findAllActiveReserveUnits();
	@Query("select u from Unit u where u.qty > 0 and UPPER(u.status) = 'I'")
	List<Unit> findAllInactiveReserveUnits();
	@Query("select u from Unit u where u.qty > 0 and UPPER(u.status) = 'A' and u.type = 'T'")
	List<Unit> findAllActiveReserveTroops();
	@Query("select u from Unit u where u.qty > 0 and UPPER(u.status) = 'A' and u.type = 'E'")
	List<Unit> findAllActiveReserveEquipment();
	@Query("select u from Unit u where u.qty > 0 and UPPER(u.status) = 'I' and u.type = 'T'")
	List<Unit> findAllInactiveReserveTroops();
	@Query("select u from Unit u where u.qty > 0 and UPPER(u.status) = 'I' and u.type = 'E'")
	List<Unit> findAllInactiveReserveEquipment();
}
