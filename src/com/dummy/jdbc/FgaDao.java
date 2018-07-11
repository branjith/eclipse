package com.dummy.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class FgaDao {

	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	public int updateEmployee(){  
	    String query="update sys.fga_log$ set ntimestamp# = systimestamp";  
	    return jdbcTemplate.update(query);  
	} 
	
	
}
