package com.vruddhi.db.common.Repository;


import com.vruddhi.db.common.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}