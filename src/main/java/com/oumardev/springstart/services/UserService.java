package com.oumardev.springstart.services;

import com.oumardev.springstart.domaine.User;
import com.oumardev.springstart.repository.UserRepository;

import java.util.List;

import org.springframework.stereotype.Service;;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
