package com.mysql.curd.employee.serviceImpl;

import com.mysql.curd.employee.model.Employee;
import com.mysql.curd.employee.repository.EmployeeRepository;
import com.mysql.curd.employee.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    //constructor dependency injection for repo
    private final EmployeeRepository repo;

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

    @Override
    public Boolean deleteById(long id) {
        Optional<Employee> emp = repo.findById(id);
        if (emp.isPresent()) {
            repo.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean updateEmp(long id, Employee newEmp) {
        Employee updateEmp = repo.findById(id).orElse(null);

        if (updateEmp != null) {
            //name
            if (newEmp.getName() != null)
                updateEmp.setName(newEmp.getName());
            //age
            if (newEmp.getAge() != 0)
                updateEmp.setAge(newEmp.getAge());
            //email
            if (newEmp.getEmail() != null)
                updateEmp.setEmail(newEmp.getEmail());
            //salary
            if (newEmp.getSalary() != 0)
                updateEmp.setSalary(newEmp.getSalary());

            /// save the new emp
            repo.save(updateEmp);
            return true;
        } else {
            return false;
        }
    }
}