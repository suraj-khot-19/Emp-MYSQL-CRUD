package com.mysql.curd.employee.controller;

import com.mysql.curd.employee.model.Employee;
import com.mysql.curd.employee.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmp() {
        return new ResponseEntity<>(empService.getAllEmp(), HttpStatus.FOUND);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Employee> getEmpById(@PathVariable("id") long id) {
        Employee emp = empService.getEmpById(id);
        if (emp != null)
            return new ResponseEntity<>(emp, HttpStatus.FOUND);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}