package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@SpringBootApplication
public class Sbjdbctemplate1Application {

	public static void main(String[] args) {
	ApplicationContext context =SpringApplication.run(Sbjdbctemplate1Application.class, args);
	StudentDao sd= context.getBean(StudentDao.class);
	Student s= new Student();
	s.setSname("Ajay Pawar");
	s.setScity("Jaipur");
	s.setSpercentage(89.78);
	System.out.println(sd.insertStudent(s));
	}

}
