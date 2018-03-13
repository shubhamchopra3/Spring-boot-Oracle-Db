package com.topics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeerepo;
	
	public List<Employees> getall()
	{
		List<Employees> employee = new ArrayList<Employees>();
		
		 employeerepo.findAll().forEach(employee::add);
		 return employee;
	}
	
	public Employees getid(String id)
	{
		return employeerepo.findOne(id);
		
	}

	public void addemployee(Employees e1) {
		
		employeerepo.save(e1);
	}

	public void updateemployee(String id, Employees e1) {
		
		employeerepo.save(e1);
		
		
	}

	public void deleteemployee(String id) {
		employeerepo.delete(id);
		
	}

	
	
}
