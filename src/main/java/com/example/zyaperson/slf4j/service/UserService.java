package com.example.zyaperson.slf4j.service;

import com.example.zyaperson.slf4j.dao.UserDao;
import com.example.zyaperson.slf4j.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserDao userDao;

    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
