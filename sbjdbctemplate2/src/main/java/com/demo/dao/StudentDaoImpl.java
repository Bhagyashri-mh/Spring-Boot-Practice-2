package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;
import com.demo.model.StudentRowMapper;

@Repository
public class StudentDaoImpl implements StudentDao{
		@Autowired
	 private JdbcTemplate j;

		@Override
		public int insertStudent(Student s) {
		String sql="insert into student(sname,scity,spercentage) values(?,?,?)";
		return j.update(sql, new Object[] {s.getSname(),s.getScity(),s.getSpercentage()});
		}

		@Override
		public int deleteStudentBySid(int sid) {
		String sql= "delete from student where sid=?";
		return j.update(sql, sid);
		}

		@Override
		public Student findStudentBySid(int sid) {
			Student s= null;
			String sql="select sid,sname,scity,spercentage from student where sid=?";
			List<Student> list =j.query(sql, new StudentRowMapper(),sid);
			if(!list.isEmpty())
				s=list.get(0);
			return s;
		}

		@Override
		public List<Student> findAllStudent() {
			String sql="select sid, sname, scity, spercentage from student";
			return j.query(sql, new StudentRowMapper());
		}

		@Override
		public int updateStudent(Student s) {
			String sql="update Student set sname=?, scity=?, spercentage=? where sid=?";
			return j.update(sql, new Object[] {s.getSname(),s.getScity(),s.getSpercentage(),s.getSid()});
		}

		
		
}
