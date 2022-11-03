package com.wuchengdong.controller;

import com.wuchengdong.pojo.User;
import com.wuchengdong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    List<User> getAllUsers() {
        return userService.getAllUser();
    }

    @DeleteMapping("/{id}")
    int deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }
}
