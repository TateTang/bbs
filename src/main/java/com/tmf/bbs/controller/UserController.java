package com.tmf.bbs.controller;

import com.tmf.bbs.service.UserServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @Resource(name = "userServicesImpl")
    UserServices services;

    @RequestMapping("/user_Login.do")
    public String queryUser(HttpServletRequest request, HttpServletResponse response, String username, String password) {
        if (services.queryUserByUserName(request, response, username, password)) {
            return "index";
        } else {
            return "login";
        }
    }

    //个人中心
    @RequestMapping("/user_GoHome.do")
    public String goUserHome() {

        return "u/home";
    }
}
