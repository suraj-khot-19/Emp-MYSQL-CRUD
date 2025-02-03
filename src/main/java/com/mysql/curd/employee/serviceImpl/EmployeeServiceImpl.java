package com.mysql.curd.employee.serviceImpl;

import com.mysql.curd.employee.model.Employee;
import com.mysql.curd.employee.repository.EmployeeRepository;
import com.mysql.curd.employee.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    //constructor dependency injection for repo
    private EmployeeRepository repo;

    public EmployeeServiceImpl(EmployeeRepository repo) {
        super();
        this.repo = repo;
    }

    //new emp then save
    @Override
    public Employee saveEmp(Employee emp) {
        return repo.save(emp);
    }
}