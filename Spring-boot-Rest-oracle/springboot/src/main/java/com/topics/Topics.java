package com.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Topics {

	
	@Autowired
	private EmployeeService emp;
	
	
	@GetMapping("/employees")
	public List<Employees> getalltopics()
	{
		return emp.getall();
		
	}
	
	@GetMapping("/employees/{id}")
public Employees getemployee(@PathVariable String id)
{
		return emp.getid(id);
}
	
	@PostMapping("/employees")
public void addEmployee(@RequestBody Employees e1)
{
		emp.addemployee(e1);
}
	@PutMapping("/employees/{id}")
public void updateEmployee(@RequestBody Employees e1, @PathVariable String id)	
{
		emp.updateemployee(id,e1);
}
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable String id)
	{
		emp.deleteemployee(id);
	}
	
	
	
	
	
	
}
