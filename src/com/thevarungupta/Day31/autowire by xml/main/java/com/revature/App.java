package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);


    }
}
