package com.demo.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s= new Student();
		s.setSid((int)rs.getObject("sid"));
		s.setSname((String)rs.getObject("sname"));
		s.setScity((String)rs.getObject("scity"));
		s.setSpercentage((double)rs.getObject("spercentage"));
		return s;
	}
	
}
