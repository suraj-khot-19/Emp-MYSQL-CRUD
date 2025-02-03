package com.mysql.curd.employee.controller;

import com.mysql.curd.employee.model.Employee;
import com.mysql.curd.employee.service.EmployeeService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

    //constructor dependency injection for service
    private EmployeeService empService;

    public EmployeeController(EmployeeService empService) {
        super();
        this.empService = empService;
    }

    @PostMapping("/new")
    public ResponseEntity<Employee> saveEmp(@RequestBody Employee emp) {
        return new ResponseEntity<>(empService.saveEmp(emp), HttpStatusCode.valueOf(201));
    }

}