package com.demo.dao;

import java.util.List;

import com.demo.model.Student;

public interface StudentDao {
	int insertStudent(Student s);
	int deleteStudentBySid(int sid);
	Student findStudentBySid(int sid);
	List<Student> findAllStudent();
	int updateStudent(Student s);
}
