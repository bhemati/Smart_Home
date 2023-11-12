package com.example.sr8.service;

import com.example.sr8.model.User;
import com.example.sr8.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class userService {
    @Autowired
    private userRepository user_Repository;


    public User save(User user)
    {
        return user_Repository.saveUser(user);
    }


    public List<User> findall()
    {
        return this.user_Repository.findAll();
    }


    public User findByEmail(String email)
    {
        return this.user_Repository.findByEmail(email);
    }

    public User findById(int id)
    {
        return this.user_Repository.findById(id);
    }
}
