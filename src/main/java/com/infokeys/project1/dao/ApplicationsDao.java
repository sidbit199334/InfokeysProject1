/*package com.infokeys.project1.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.infokeys.project1.model.Applicant;

@Repository("applicationsDao")
public class ApplicationsDao {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public boolean fetchApplications(int jobid){
		
		String query="select * from APPLICANTS where JOBID="+jobid+";";
				jdbctemplate.query(query, rs)
		return false;}
	
public List<Applicant> getApplicantsById(int jobid)
{  
		 return jdbctemplate.query("select * from applicants where jobid="+jobid,new ResultSetExtractor<List<Applicant>>(){  
		    public List<Applicant> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<Applicant> list=new ArrayList<Applicant>();  
		        while(rs.next()){  
		        	Applicant app=new Applicant();  
		        app.setFirstname(rs.getString(1));  
		        app.setLastname(rs.getString(2));
		        app.setEmail(rs.getString(3));
		        app.setPhone(rs.getInt(4));
		        app.setJobid(rs.getInt(5));
		        app.setResume(rs.getString(6));
		        
		        list.add(app);  
		        } 
		        return list;  
		        }

			public List<Applicant> extractData(ResultSet arg0) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				return null;
			}

		 
		    });  
		  }  
	

}*/
