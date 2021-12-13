package com.revature.spring.rest.api.service;

import com.revature.spring.rest.api.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(Long id);
    public Employee saveEmployee(Employee employee);
    public void updateEmployee(Long id, Employee employee);
    public void deleteEmployee(Long id);
}
