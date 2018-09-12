package com.tmf.bbs.controls;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tmf.bbs.services.AnnounceServices;

@Controller
public class AnnounceController {
	@Resource(name="announceServicesImpl")
	AnnounceServices services;
	
	@RequestMapping("/anno_getIndexAnno.do")
	public String queryByList(HttpServletRequest request) {
		services.getIndexAnno(request);
		return "indexAnno";
	}
	
	@RequestMapping("/anno_getAll.do")
	public String queryAll(HttpServletRequest request, Integer annoId) {
		services.getAllAnno(request,annoId);
		return "announce";
	}
	
}
