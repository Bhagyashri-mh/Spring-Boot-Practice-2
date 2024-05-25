package com.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@SpringBootApplication
public class Sbjdbctemplate2Application {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(Sbjdbctemplate2Application.class, args);
	StudentDao sd= context.getBean(StudentDao.class);
	//System.out.println(sd.deleteStudentBySid(1));
	//System.out.println(sd.findStudentBySid(2));
	/*List<Student> list = sd.findAllStudent();
	for(Student s:list)
		System.out.println(s); */
	
	Student s= sd.findStudentBySid(2);
	s.setSname("Vijay Pawar");
	s.setScity("pune");
	System.out.println(sd.updateStudent(s));
	}

}
