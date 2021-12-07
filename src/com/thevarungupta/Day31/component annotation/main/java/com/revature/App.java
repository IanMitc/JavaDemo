package com.revature;

import com.revature.beans.Employee;
import com.revature.beans.Student;
import com.revature.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Employee employee = (Employee) context.getBean("emp");
        employee.setName("new name");
        System.out.println(employee);

        Student student = (Student) context.getBean("student");
        System.out.println(student);

        User user = (User) context.getBean("user");
        System.out.println(user);


    }
}
