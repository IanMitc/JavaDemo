package com.revature.spring.boot.data.demo.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(
        name = "tbl_guardian",
        uniqueConstraints = @UniqueConstraint(
                name = "email_unique",
                columnNames = "guardian_email"
        ))
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name = "guardian_name")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name = "guardian_email")
        ),
        @AttributeOverride(
                name = "mobile",
                column = @Column(name = "guardian_mobile")
        )
})
public class Guardian {
    @Id
    private long guardianId;
    private String name;
    private String email;
    private String mobile;

    @Getter
    @Setter
    @OneToMany(mappedBy = "guardian")
    Set<Student> students = new java.util.LinkedHashSet<>();
}
