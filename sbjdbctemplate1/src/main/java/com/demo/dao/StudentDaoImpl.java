package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
     @Autowired
	private JdbcTemplate j;

	@Override
	public int insertStudent(Student s) {
		String sql="insert into Student (sname, scity, spercentage) values(?,?,?)";
		return j.update(sql, new Object[] {s.getSname(),s.getScity(),s.getSpercentage() });
	}
}
