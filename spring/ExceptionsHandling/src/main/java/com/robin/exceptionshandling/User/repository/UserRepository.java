package com.robin.exceptionshandling.User.repository;

import com.robin.exceptionshandling.User.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserById(Integer id);
}
