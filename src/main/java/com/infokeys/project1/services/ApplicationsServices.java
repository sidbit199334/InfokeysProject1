/*package com.infokeys.project1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infokeys.project1.dao.ApplicationsDao;
import com.infokeys.project1.model.Applicant;

@Service("applicationsServices")
public class ApplicationsServices {
	
	@Autowired
	ApplicationsDao applicationsDao;
	
	public List<Applicant> getAllDataById(int jobid){
		return applicationsDao.getApplicantsById(jobid);
		
	}
	
	

}
*/