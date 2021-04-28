package com.tmf.bbs.service;

import javax.servlet.http.HttpServletRequest;

public interface HelpServices {

	void getIndexHelp(HttpServletRequest request);

	void getAllHelp(HttpServletRequest request, Integer helpId);
}
