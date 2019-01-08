package com.redisdemo.controller;


import com.redisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName:  UserController
 * @Description:  
 * @author: 周志浩
 * @date: 2019/1/8-15:17
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "welcome-web.do")
    public String welcomeWeb(){
        return "pages/index";
    }

}
