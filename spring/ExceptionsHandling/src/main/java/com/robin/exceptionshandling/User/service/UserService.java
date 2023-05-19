package com.robin.exceptionshandling.User.service;

import com.robin.exceptionshandling.User.dto.UserRequest;
import com.robin.exceptionshandling.User.entity.User;
import com.robin.exceptionshandling.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository repository;

    @Autowired
    public UserService(UserRepository repo) {
        repository = repo;
    }

    public User saveUser(UserRequest newUser) {
        User user = User.build(0, newUser.getName(), newUser.getEmail(), newUser.getMobile(), newUser.getGender(), newUser.getAge(), newUser.getNationality());
        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User getUserById(Integer id) {
        return repository.findByUid(id);
    }
}
