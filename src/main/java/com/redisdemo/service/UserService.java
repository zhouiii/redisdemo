package com.redisdemo.service;

import com.redisdemo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName:  UserService
 * @Description:  
 * @author: 周志浩
 * @date: 2019/1/8-15:20
 */
@Service(value = "userService")
public class UserService {

    @Autowired
    private UserDao userDao;

}
