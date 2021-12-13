package com.revature.spring.rest.api.controller;

import com.revature.spring.rest.api.entity.Employee;
import com.revature.spring.rest.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return service.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployees(@PathVariable("id") Long id){
        return service.getEmployeeById(id);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }

}
