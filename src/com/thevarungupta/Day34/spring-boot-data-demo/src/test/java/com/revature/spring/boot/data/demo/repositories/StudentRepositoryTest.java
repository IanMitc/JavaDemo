package com.revature.spring.boot.data.demo.repositories;

import com.revature.spring.boot.data.demo.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository repository;

    @Test
    public void saveStudnet(){
        Student student = Student.builder()
                .emailId("abc@gmail.com")
                .firstName("Mark")
                .lastName("Smith")
                .guardianName("Paul")
                .guardianEmail("p@gmail.com")
                .guardianMobile("123456")
                .build();
        repository.save(student);
    }

}