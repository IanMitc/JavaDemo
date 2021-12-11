package com.revature.spring.boot.data.demo.repositories;

import com.revature.spring.boot.data.demo.entities.Guardian;
import com.revature.spring.boot.data.demo.entities.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private GuardianRepository guardianRepository;
    @Test
    public void saveStudnet() {

        Student student = Student.builder()
                .emailId("abc@gmail.com")
                .firstName("Mark")
                .lastName("Smith")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {
        Guardian guardian = Guardian.builder()
                .name("Paul G")
                .email("pg@gmail.com")
                .mobile("9999")
                .build();

        guardianRepository.save(guardian);

        Student student = Student.builder()
                .firstName("mark2")
                .lastName("watson")
                .emailId("m2@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void findStudentsByFirstName() {
        List<Student> list = studentRepository.findByFirstName("sss");
        System.out.println("Studnets: " + list);
    }

}