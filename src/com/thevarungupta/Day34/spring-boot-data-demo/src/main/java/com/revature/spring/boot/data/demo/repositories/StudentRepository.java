package com.revature.spring.boot.data.demo.repositories;

import com.revature.spring.boot.data.demo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByFirstName(String firstName);
    List<Student> findFirstNameContaining(String firstName);
    List<Student> findByLastNameNotNull();
    List<Student> findByGuardianName(String guradianName);
    Student findByFirstNameAndLastName(String firstName, String lastName);

    // JPQL
    @Query("select s from Student s where s.emailId = ?1")
    Student getStudentByEmailAddress(String emailId);

    // JPQL
    @Query("select s.firstName from Student s where s.emailId = ?1")
    String getStudentFirstNameByEmailAddress(String emailId);

    // native
    @Query(
            value = "select * from tbl_student s where s.email_address  = ?1",
            nativeQuery = true
    )
    Student getStudnetByEmailNative(String firstName);

    //native names params
    @Query(
            value = "select * from tbl_student s where s.email_address  = :emailId",
            nativeQuery = true
    )
    Student getStudentByEmailNativeParam(
            @Param("emailId") String emailId);
}
