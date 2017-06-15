/*package com.infokeys.project1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository("managerdao")
public class ManagerDao {

		
		@Autowired
		private JdbcTemplate jdbctemplate;
		
		
		public boolean loginCheck(String username,String password){
			String query="select*from login where USER_NAME='"+username+"' and PASSWORD='"+password+"'";
			int result=jdbctemplate.update(query);
			if(result>0)
					return true;
				else
					return false;
				
		}
	}

			
*/
				
			
		

