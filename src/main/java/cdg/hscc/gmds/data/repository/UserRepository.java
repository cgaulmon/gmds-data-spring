package cdg.hscc.gmds.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cdg.hscc.gmds.data.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
