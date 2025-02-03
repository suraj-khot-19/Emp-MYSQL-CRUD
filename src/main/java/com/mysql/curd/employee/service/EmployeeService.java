package com.mysql.curd.employee.service;

import com.mysql.curd.employee.model.Employee;

public interface EmployeeService {

    //new emp then save
    Employee saveEmp(Employee emp);
}