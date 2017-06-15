/*package com.infokeys.project1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository("hRdao")
public class HRdao {

		
		@Autowired
		private JdbcTemplate jdbctemplate;
		
		
		public boolean loginCheck(String username,String password){
			String query="select*from HRLOGIN where USER_NAME='"+username+"' and PASSWORD='"+password+"'";
			int result=jdbctemplate.update(query);
			if(result>0)
					return true;
				else
					return false;
				
		}
	}

			
*/
				
			
		

