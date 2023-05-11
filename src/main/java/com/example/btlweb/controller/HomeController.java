package com.example.btlweb.controller;

import com.example.btlweb.dto.ProductDTO;
import com.example.btlweb.dto.UserDTO;
import com.example.btlweb.model.Product;
import com.example.btlweb.model.User;
import com.example.btlweb.service.CategoryService;
import com.example.btlweb.service.ProductService;
import com.example.btlweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class HomeController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;
    @Autowired
    UserService userService;

    @GetMapping({"/","/home"})
    public String home(Model model){
        return "index";
    }

    @GetMapping({"/login"})
    public String login(Model model){
        return "login";
    }

    @GetMapping({"/register"})
    public String register(Model model){
        return "register";
    }

    @PostMapping("/register")
    public String userAddPost(@ModelAttribute("userDTO")UserDTO userDTO) throws IOException {
        User user = new User();
        user.setId(userDTO.getId());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        userService.addUser(user);
        return "redirect:/login";
    }
}
