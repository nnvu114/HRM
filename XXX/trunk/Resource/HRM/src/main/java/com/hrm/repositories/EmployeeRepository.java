package com.hrm.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Pageable;

import com.hrm.entities.Employee;

/**
 * @author Admin
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	/**
	 * The find one employee by username
	 * 
	 * @param username
	 *            The username
	 * @return object
	 */
	public Employee findByUserName(String username);

	/**
	 * The find all employee with conditions
	 * 
	 * @param name
	 *            The name
	 * @param telephone
	 *            The phone number
	 * @param email
	 *            The email
	 * @param pageable
	 *            The pagination
	 * @return List Employee
	 */
	@Query("Select e From Employee e WHERE " + "(:name = '' OR e.firstName LIKE CONCAT('%', :name, '%')) AND "
			+ "(:telephone = '' OR e.telephone LIKE CONCAT('%', :telephone, '%')) AND "
			+ "(:email = '' OR e.email LIKE CONCAT('%', :email, '%')) AND e.status = 0")
	public List<Employee> findAllEmployeeHadCondition(@Param("name") String name,
			@Param("telephone") String telephone, @Param("email") String email, Pageable pageable);
	
	/**
	 * The find all employee with conditions
	 * 
	 * @param name
	 *            The name
	 * @param telephone
	 *            The phone number
	 * @param email
	 *            The email
	 * @param pageable
	 *            The pagination
	 * @return List Employee
	 */
	@Query("Select count(e) From Employee e WHERE " + "(:name = '' OR e.firstName LIKE CONCAT('%', :name, '%')) AND "
			+ "(:telephone = '' OR e.telephone LIKE CONCAT('%', :telephone, '%')) AND "
			+ "(:email = '' OR e.email LIKE CONCAT('%', :email, '%')) AND e.status = 0")
	public long getTotalEmployeeHadCondition(@Param("name") String name,
			@Param("telephone") String telephone, @Param("email") String email);

	/**
	 * The check email has yet existed .
	 * 
	 * @param email
	 *            The email
	 * @return long
	 */
	@Query("Select count(e) From Employee e WHERE e.email = :email AND (:employeeId IS NULL OR e.employeeId <> :employeeId)")
	public long checkEmail(@Param("email") String email, @Param("employeeId") Long employeeId);
	
	/**
	 * The check userName has yet existed .
	 * 
	 * @param userName
	 *            The userName
	 * @return long
	 */
	@Query("Select count(e) From Employee e WHERE e.userName = :userName AND (:employeeId IS NULL OR e.employeeId <> :employeeId)")
	public long checkUserName(@Param("userName") String userName, @Param("employeeId") Long employeeId);
	
	@Modifying
	@Query("Update Employee e SET e.status = :status WHERE e.employeeId = :employeeId")
	public long updateStatus(@Param("status") int status, @Param("employeeId") Long employeeId);
}
