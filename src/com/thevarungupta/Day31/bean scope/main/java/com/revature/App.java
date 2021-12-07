package com.revature;

import com.revature.beans.Employee;
import com.revature.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Employee employee = (Employee) context.getBean("emp");
        System.out.println(employee.hashCode());

        Employee employee2 = (Employee) context.getBean("emp");
        System.out.println(employee2.hashCode());






    }
}
