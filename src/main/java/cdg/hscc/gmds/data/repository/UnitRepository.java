package cdg.hscc.gmds.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cdg.hscc.gmds.data.entity.Unit;

public interface UnitRepository extends JpaRepository<Unit, Long> {

	@Query("select u from Unit u where UPPER(u.unitType) = 'T'")
	List<Unit> findAllTroops();
	@Query("select u from Unit u where UPPER(u.unitType) = 'E'")
	List<Unit> findAllEquipment();
	@Query("select u from Unit u where u.qty > 0 and UPPER(u.status) = 'A'")
	List<Unit> findAllActiveReserveUnits();
	@Query("select u from Unit u where u.qty > 0 and UPPER(u.status) = 'A' and u.unitType = 'T'")
	List<Unit> findAllActiveReserveTroops();
	@Query("select u from Unit u where u.qty > 0 and UPPER(u.status) = 'I' and u.unitType = 'T'")
	List<Unit> findAllInactiveReserveTroops();
	@Query("select u from Unit u where UPPER(u.status) = 'A' and u.unitType = 'E'")
	List<Unit> findAllActiveReserveEquipment();
	@Query("select u from Unit u where UPPER(u.status) = 'I' and u.unitType = 'E'")
	List<Unit> findAllInactiveReserveEquipment();
	Unit findByUnitId(int unitId);
}
