package com.minori.hrm.repositorys;


import com.minori.hrm.models.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Integer> {

	@Query(value="SELECT * FROM users where username = :username", nativeQuery = true)
	User findByUsername(@Param("username") String username);

	@Modifying
	@Transactional
	@Query(value="UPDATE users SET user_name = :username where id = :id", nativeQuery = true)
	int updateUsername(@Param("username") String username, @Param("id") int id);

	@Modifying
	@Transactional
	@Query(value="UPDATE users SET password = :password where id = :id", nativeQuery = true)
	int updatePassword(@Param("password") String password, @Param("id") int id);

	@Modifying
	@Transactional
	@Query(value="UPDATE users SET enabled = :enabled where id = :id", nativeQuery = true)
	int updateEnabled(@Param("enabled") boolean enabled, @Param("id") int id);
}
