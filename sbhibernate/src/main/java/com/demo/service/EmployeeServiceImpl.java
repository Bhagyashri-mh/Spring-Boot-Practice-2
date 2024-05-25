package com.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
		private EmployeeDao ed;

		@Override
		public Employee save(Employee e) {
			return ed.save(e);
		}
}
