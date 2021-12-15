package com.revature.department.service.controller;

import com.revature.department.service.entity.Department;
import com.revature.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping
    public List<Department> getAllDepartment(){
        log.info("get all department");
        return service.getAllDepartment();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") long id){
        log.info("get department by id "+ id);
        return service.getDepartmentById(id);
    }

    @PostMapping
    public Department saveDepartment(@RequestBody Department department){
        log.info("save department");
        return service.saveDepartment(department);
    }
}
