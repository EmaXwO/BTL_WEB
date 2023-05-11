package com.example.btlweb.service;

import com.example.btlweb.model.Product;
import com.example.btlweb.model.User;
import com.example.btlweb.repository.ProductRepository;
import com.example.btlweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    public void addUser(User user){
        userRepository.save(user);
    }
    public void removeUserById(long id){
        userRepository.deleteById(id);
    }
    public Optional<User> getUserById(long id){
        return userRepository.findById(id);
    }
}
