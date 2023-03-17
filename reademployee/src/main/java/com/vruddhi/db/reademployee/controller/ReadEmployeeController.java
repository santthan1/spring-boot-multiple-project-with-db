package com.vruddhi.db.reademployee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vruddhi.db.common.Model.Employee;
import com.vruddhi.db.common.Repository.EmployeeRepository;


@RestController
public class ReadEmployeeController {

	@Autowired
	EmployeeRepository emp;

    @GetMapping("/readEmployeeDetails")
    public String readEmployeeDetails(@RequestParam Integer id){
    	Optional<Employee> data = emp.findById(id);
		return data.isPresent()?data.get().toString():"No Data Found";
    	
    }


}