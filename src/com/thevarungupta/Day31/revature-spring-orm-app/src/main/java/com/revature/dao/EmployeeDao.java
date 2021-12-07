package com.revature.dao;

import com.revature.entities.Employee;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;

public class EmployeeDao {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public int insert(Employee employee){
        // insert
        Integer integer = (Integer) this.hibernateTemplate.save(employee);
        return integer;
    }
}
