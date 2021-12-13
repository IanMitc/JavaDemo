package com.revature.spring.rest.api.service;

import com.revature.spring.rest.api.entity.Employee;
import com.revature.spring.rest.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repository.getById(id);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public void updateEmployee(Long id, Employee employee) {

    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
