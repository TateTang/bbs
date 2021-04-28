package com.tmf.bbs.service;

import javax.servlet.http.HttpServletRequest;

public interface TopicServices {
	public void getIndexHotTopic(HttpServletRequest request);
	
	public void getIndexNiceTopic(HttpServletRequest request);
	
	public void getIndexFreshTopic(HttpServletRequest request);
}
