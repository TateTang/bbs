package com.tmf.bbs.service;

import javax.servlet.http.HttpServletRequest;

public interface AnnounceServices {
    void getIndexAnno(HttpServletRequest request);

    void getAllAnno(HttpServletRequest request, Integer annoId);
//	public void getAnnoById(HttpServletRequest request,Integer annoId);
}
