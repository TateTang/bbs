package com.tmf.bbs.service;

import javax.servlet.http.HttpServletRequest;

public interface HelpServices {
	public void getIndexHelp(HttpServletRequest request);
	public void getAllHelp(HttpServletRequest request,Integer helpId);
}
