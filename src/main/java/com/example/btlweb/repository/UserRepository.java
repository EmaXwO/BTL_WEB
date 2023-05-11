package com.example.btlweb.repository;

import com.example.btlweb.model.Product;
import com.example.btlweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    //List<User> findAllByCategory_Id(int id);
}
