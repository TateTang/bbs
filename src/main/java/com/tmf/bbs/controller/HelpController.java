package com.tmf.bbs.controller;

import com.tmf.bbs.service.HelpServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HelpController {
    @Resource(name = "helpServicesImpl")
    HelpServices services;

    @RequestMapping("/help_getIndexHelp.do")
    public String queryByList(HttpServletRequest request) {
        services.getIndexHelp(request);
        return "indexHelp";
    }

    @RequestMapping("/help_getAll.do")
    public String queryAll(HttpServletRequest request, Integer helpId) {
        return "help";
    }
}
