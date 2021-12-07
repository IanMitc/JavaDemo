package com.revature;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    private Course course;

    public Student(Course course) {
        this.course = course;
        System.out.println("constructor");
    }

    public Course getCourse() {
        return course;
    }
    @Autowired
    public void setCourse(Course course) {
        this.course = course;
        System.out.println("setter");
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                '}';
    }
}
