package com.redisdemo.service;

import com.redisdemo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserService {

    @Autowired
    private UserDao userDao;

}
