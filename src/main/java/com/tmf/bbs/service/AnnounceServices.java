package com.tmf.bbs.service;

import javax.servlet.http.HttpServletRequest;

public interface AnnounceServices {
	public void getIndexAnno(HttpServletRequest request);
	public void getAllAnno(HttpServletRequest request,Integer annoId);
//	public void getAnnoById(HttpServletRequest request,Integer annoId);
}
