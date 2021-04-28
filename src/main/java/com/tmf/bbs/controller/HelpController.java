package com.tmf.bbs.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tmf.bbs.service.HelpServices;

@Controller
public class HelpController {
	@Resource(name="helpServicesImpl")
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
