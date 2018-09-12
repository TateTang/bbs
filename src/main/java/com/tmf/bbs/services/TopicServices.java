package com.tmf.bbs.services;

import javax.servlet.http.HttpServletRequest;

public interface TopicServices {
	public void getIndexHotTopic(HttpServletRequest request);
	
	public void getIndexNiceTopic(HttpServletRequest request);
	
	public void getIndexFreshTopic(HttpServletRequest request);
}
