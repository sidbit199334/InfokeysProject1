package com.infokeys.project1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infokeys.project1.dao.ApplicantDao;

import oracle.sql.BLOB;

@Service("applicantServices")
public class ApplicantServices {

	@Autowired
	ApplicantDao applicantDao;

	public int registerApplicant(String firstname, String lastname, String email, Integer phone, Integer jobid,
			String resumee) {

		return applicantDao.getData(firstname,lastname,email,phone,jobid,resumee);

	}

}
