package com.revature.user.service.service;

import com.revature.user.service.dto.Department;
import com.revature.user.service.dto.UserResponseDto;
import com.revature.user.service.entity.User;
import com.revature.user.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserRepository repository;

    public List<User> getAllUser() {
        return repository.findAll();
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public UserResponseDto getUserWithDepartment(Long userId) {
        // get user
        User user = repository.findByUserId(userId);

        // get department
        Department department = restTemplate
                .getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
                        Department.class);

        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setDepartment(department);
        responseDto.setUser(user);
        return responseDto;
    }
}
