package com.example.zyaperson.slf4j.controller;

import com.example.zyaperson.slf4j.entity.User;
import com.example.zyaperson.slf4j.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/listall")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

}
