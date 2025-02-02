package com.mysql.curd.employee.serviceImpl;

import com.mysql.curd.employee.model.Employee;
import com.mysql.curd.employee.repository.EmployeeRepository;
import com.mysql.curd.employee.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    //constructor injection
    private EmployeeRepository repo;

    public EmployeeServiceImpl(EmployeeRepository repo) {
        super();
        this.repo = repo;
    }

    @Override
    public Employee saveEmp(Employee employee) {
        return repo.save(employee);
    }
}
