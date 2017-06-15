package com.infokeys.project1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import oracle.sql.BFILE;
import oracle.sql.BLOB;

@Repository("applicantDao")
public class ApplicantDao {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public int getData(String firstname, String lastname, String email, Integer phone, Integer jobid, String resumee) {

		String insertQuery = "insert into Applicants values('"+firstname + "','" + lastname + "','" + email + "',"
				+ phone + "," + jobid + ",'" + resumee + "')";
		int result = jdbctemplate.update(insertQuery);
		/*
		 * Session session = sessionFactory.openSession();
		 * session.beginTransaction(); Query result=
		 * session.createQuery("from Applicant");
		 */
		return result;
	}

}
