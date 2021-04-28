package com.tmf.bbs.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.tmf.bbs.dao.HelpDao;
import com.tmf.bbs.entity.Help;
import com.tmf.bbs.service.HelpServices;

@Service("helpServicesImpl")
public class HelpServicesImpl implements HelpServices{
	@Resource
	HelpDao helpDao;

	@Override
	public void getIndexHelp(HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<Help> helpList = helpDao.getIndexHelp();
		request.setAttribute("helpList", helpList);
	}

	@Override
	public void getAllHelp(HttpServletRequest request, Integer helpId) {
		// TODO Auto-generated method stub
		List<Help> allHelp = helpDao.getAllHelp();
		request.setAttribute("allHelp", allHelp);
		request.setAttribute("help", helpDao.getHelpById(helpId));
		request.setAttribute("helpsize", helpDao.countHelp());
	}
	
	

}
