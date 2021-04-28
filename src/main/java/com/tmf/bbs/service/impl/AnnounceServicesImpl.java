package com.tmf.bbs.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.tmf.bbs.dao.AnnounceDao;
import com.tmf.bbs.entity.Announce;
import com.tmf.bbs.service.AnnounceServices;

@Service("announceServicesImpl")
public class AnnounceServicesImpl implements AnnounceServices{
	@Resource
	AnnounceDao annoDao;
	
	@Override
	public void getIndexAnno(HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<Announce> annouceList = annoDao.getIndexAnno();
		request.setAttribute("annouceList", annouceList);
	}

	@Override
	public void getAllAnno(HttpServletRequest request,Integer annoId) {
		// TODO Auto-generated method stub
		List<Announce> allAnnounce = annoDao.getAllAnno();
		Announce announce = annoDao.getAnnoById(annoId);
		System.out.println(announce);
		System.out.println(annoDao.countAnno());
		request.setAttribute("allAnnounce", allAnnounce);
		request.setAttribute("announce", annoDao.getAnnoById(annoId));
		request.setAttribute("annosize", annoDao.countAnno());
	}

//	public void getAnnoById(HttpServletRequest request, Integer annoId) {
//		// TODO Auto-generated method stub
//		int annosize = annoDao.countAnno();
//		System.out.println(annosize);
//		System.out.println(annoId);
//		Announce announce = annoDao.getAnnoById(annoId);
//		System.out.println(announce.getTitle());
//		request.setAttribute("announce", announce);
//		request.setAttribute("annosize", annosize);
//	}
}
