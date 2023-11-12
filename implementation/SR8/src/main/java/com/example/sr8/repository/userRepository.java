package com.example.sr8.repository;

import com.example.sr8.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface userRepository extends JpaRepository<User,Integer> {
    List<User> findAll();
    User findByEmail(String email);

    User findById(int id);
    User saveUser(User user);

}
