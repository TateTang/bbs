package com.tmf.bbs.services;

import javax.servlet.http.HttpServletRequest;

public interface HelpServices {
	public void getIndexHelp(HttpServletRequest request);
	public void getAllHelp(HttpServletRequest request,Integer helpId);
}
