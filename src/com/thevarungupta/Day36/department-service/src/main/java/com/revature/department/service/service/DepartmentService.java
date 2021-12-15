package com.revature.department.service.service;

import com.revature.department.service.entity.Department;
import com.revature.department.service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department) {
        return repository.save(department);
    }

    public List<Department> getAllDepartment() {
        return repository.findAll();
    }

    public Department getDepartmentById(long id) {
        return repository.findByDepartmentId(id);
    }
}
