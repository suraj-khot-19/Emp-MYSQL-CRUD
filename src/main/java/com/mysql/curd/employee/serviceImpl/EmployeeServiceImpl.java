package com.mysql.curd.employee.serviceImpl;

import com.mysql.curd.employee.model.Employee;
import com.mysql.curd.employee.repository.EmployeeRepository;
import com.mysql.curd.employee.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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


    @Override
    public List<Employee> getAllEmp() {
        return repo.findAll();
    }


    @Override
    public Employee getEmpById(long id) {
        Optional<Employee> emp = repo.findById(id);
        return emp.orElse(null);
    }
}