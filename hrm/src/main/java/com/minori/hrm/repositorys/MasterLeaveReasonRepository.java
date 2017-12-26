package com.minori.hrm.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.minori.hrm.models.MasterLeaveReason;

@Repository
public interface MasterLeaveReasonRepository extends CrudRepository<MasterLeaveReason, Integer>{

}