package com.minori.hrm.repositorys;


import com.minori.hrm.models.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("employeeRepository")
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	Employee findByIdentificationId(String id);
	
	@Query("SELECT em from Employee em where (:name IS NULL OR em.firstName LIKE CONCAT('%',:name,'%')) OR (:name IS NULL OR em.lastName LIKE CONCAT('%',:name,'%'))")
	public List<Employee> getListEmployeeByName(@Param("name") String  name );
}
