package com.mysql.curd.employee.controller;

import com.mysql.curd.employee.model.Employee;
import com.mysql.curd.employee.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

    //constructor injection for employee service layer
    private EmployeeService empService;

    public EmployeeController(EmployeeService empService) {
        super();
        this.empService = empService;
    }

    //save the employee post method
    @PostMapping("/new")
    public ResponseEntity<Employee> saveEmp(@RequestBody Employee employee) {
        return new ResponseEntity<>(empService.saveEmp(employee), HttpStatus.CREATED);
    }
}