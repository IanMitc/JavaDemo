package com.revature;

import com.revature.dao.EmployeeDao;
import com.revature.entities.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        EmployeeDao dao = context.getBean("employeeDao", EmployeeDao.class);
        Employee emp = new Employee(123, "mark", "mark@gmail.com");
        int r = dao.insert(emp);
        System.out.println("done "+ r);
    }
}
