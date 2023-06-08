package com.example.VaccineManagementSystem.Services;

import com.example.VaccineManagementSystem.models.User;
import com.example.VaccineManagementSystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;

    public User addUser(User user){
        System.out.println("The user is "+user);
        user = userRepository.save(user);
        return user;
    }
}