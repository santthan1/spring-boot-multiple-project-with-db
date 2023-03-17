package com.vruddhi.db.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vruddhi.db.common.Model.Employee;
import com.vruddhi.db.common.Repository.EmployeeRepository;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository emp;

    @GetMapping("/writeEmployeeDetails")
    public String writeEmployeeDetails(@RequestParam Integer id, @RequestParam String name,@RequestParam String email){
    	Employee e=new Employee(id,name,email);
    	try {
    		emp.save(e);
    		return "success";
    	}catch(Exception ex) {
    		return ex.getMessage();
    	}
    	
    }


}