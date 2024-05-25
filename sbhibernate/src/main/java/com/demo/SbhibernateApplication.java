package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@SpringBootApplication
public class SbhibernateApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(SbhibernateApplication.class, args);
	EmployeeDao ed= context.getBean(EmployeeDao.class);
	Employee e= new Employee();
	e.setEname("Jay Thakur");
	e.setEdesignation("Data Analyst");
	e.setEcompany("Cognizant");
	e.setEsalary(20000);
	System.out.println(ed.save(e));
	}

}
