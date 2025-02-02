package com.mysql.curd.employee.repository;

import com.mysql.curd.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    //all methods automatic
}
