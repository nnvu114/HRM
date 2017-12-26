package com.minori.hrm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

import com.minori.hrm.services.MasterLeaveReasonService;
import com.minori.hrm.services.MasterRelationshipService;

@SpringBootApplication
public class HrmApplication implements ApplicationListener<ApplicationReadyEvent>{

	@Autowired
	private MasterLeaveReasonService masterLeaveReaonService;
	
	@Autowired
	private MasterRelationshipService masterRelationshipService;
	
	public static void main(String[] args) {
		SpringApplication.run(HrmApplication.class, args);
	}
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent arg0) {
		masterLeaveReaonService.init();
		masterRelationshipService.init();
	}
}
