package com.revature.dao;

import com.revature.entities.Employee;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

public class EmployeeDao {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    // add employee
    @Transactional
    public int addEmployee(Employee employee) {
        // insert
        Integer integer = (Integer) this.hibernateTemplate.save(employee);
        return integer;
    }

    // get all employee
    public List<Employee> getAllEmployees() {
        List<Employee> list = hibernateTemplate.loadAll(Employee.class);
        return list;
    }

    // get employee by id
    public Employee getEmployeeById(int id) {
        Employee employee = hibernateTemplate.get(Employee.class, id);
        return employee;
    }

    // update employee
    @Transactional
    public void updateEmployee(Employee updateEmployee) {
        hibernateTemplate.update(updateEmployee);
    }

    // delete employee
    @Transactional
    public void deleteEmployee(int id) {
        Employee employee = getEmployeeById(id);
        hibernateTemplate.delete(employee);
    }
}
