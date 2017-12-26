package com.minori.hrm.repositorys;

import java.sql.Timestamp;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.minori.hrm.models.WktLeaveRequest;

public interface WktLeaveRequestRepository extends CrudRepository<WktLeaveRequest, Integer> {
	
	@Query("select re from WktLeaveRequest re where (re.employee.employeeId = :employeeId) "
			+ " and (:requestType IS NULL OR re.requestType = :requestType) and (:fromDay IS NULL OR re.createdDate > :fromDay) "
			+ "and (:toDay IS NULL OR re.createdDate < :toDay) "
			+ "and (re.status <> :status)")
	public List<WktLeaveRequest> getListTimeOff(@Param("requestType") Integer requestType
			,@Param("fromDay") Timestamp fromDay,@Param("toDay") Timestamp toDay
			,Pageable pageabl,@Param("employeeId") Integer employeeId ,@Param("status") int status);

	@Query("select count(re) from WktLeaveRequest re where (re.employee.employeeId = :employeeId) "
			+ " and (:requestType IS NULL OR re.requestType = :requestType) and (:fromDay IS NULL OR re.createdDate > :fromDay) "
			+ "and (:toDay IS NULL OR re.createdDate < :toDay) "
			+ "and (re.status <> :status)")
	public long countListTimeOff(@Param("requestType") Integer requestType
			,@Param("fromDay") Timestamp fromDay,@Param("toDay") Timestamp toDay
			,@Param("employeeId") Integer employeeId,@Param("status") int status);
	
	@Modifying
	@Query("UPDATE WktLeaveRequest SET status = :status WHERE leaveRequestId = :leaveRequestId")
	public int deleteTimeOff(@Param("leaveRequestId") Integer leaveRequestId,@Param("status") int status);

	@Query("SELECT re FROM WktLeaveRequest re WHERE re.status <> :status and re.leaveRequestId = :leaveRequestId")
	public WktLeaveRequest findTimeoff(@Param("leaveRequestId") Integer leaveRequestId,@Param("status") int status);

}
