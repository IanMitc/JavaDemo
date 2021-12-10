package com.revature.spring.boot.data.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    private Long studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;
}
