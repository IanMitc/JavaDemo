package com.revature.spring.boot.data.demo.repositories;

import com.revature.spring.boot.data.demo.entities.Guardian;
import com.revature.spring.boot.data.demo.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository repository;

    @Test
    public void saveStudnet() {

        Student student = Student.builder()
                .emailId("abc@gmail.com")
                .firstName("Mark")
                .lastName("Smith")
                .build();
        repository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {
        Guardian guardian = Guardian.builder()
                .name("Paul G")
                .email("pg@gmail.com")
                .mobile("9999")
                .build();
        Student student = Student.builder()
                .firstName("mark2")
                .lastName("watson")
                .emailId("m2@gmail.com")
                .guardian(guardian)
                .build();

        repository.save(student);
    }

    @Test
    public void findStudentsByFirstName() {
        List<Student> list = repository.findByFirstName("sss");
        System.out.println("Studnets: " + list);
    }

}