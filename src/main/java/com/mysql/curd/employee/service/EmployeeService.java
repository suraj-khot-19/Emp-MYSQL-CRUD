package com.mysql.curd.employee.service;

import com.mysql.curd.employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    //new emp then save
    Employee saveEmp(Employee emp);

    List<Employee> getAllEmp();

    Employee getEmpById(long id);
}