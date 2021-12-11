package com.revature.spring.boot.data.demo.repositories;

import com.revature.spring.boot.data.demo.entities.Guardian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuardianRepository extends JpaRepository<Guardian, Long> {
    List<Guardian> findByName(String name);

    List<Guardian> findByNameContaining(String name);

}
