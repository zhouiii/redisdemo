package com.redisdemo.controller;


import com.redisdemo.service.UserService;
import com.redisdemo.util.RedisDemoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "welcome-web.do")
    public String welcomeWeb() {
        return "pages/index";
    }

    @RequestMapping(value = "redis-add-test.do", method = RequestMethod.POST)
    @ResponseBody
    public String redisAddTest(String paramtest) {
        System.out.println(paramtest);
        boolean b = RedisDemoUtil.setString("123", paramtest);
        System.out.println(b);
        System.out.println(RedisDemoUtil.getString("123"));

        return RedisDemoUtil.getString("123");
    }


    @RequestMapping(value = "redis-del-test.do", method = RequestMethod.POST)
    @ResponseBody
    public String redisDelTest(String paramtest) {
        boolean b = RedisDemoUtil.hasKey(paramtest);
        if (b) {
            b = RedisDemoUtil.del(paramtest);
            if (b) {
                return "删除成功";
            } else {
                return "删除失败";
            }
        } else {
            return "key 不存在";
        }
    }

}
