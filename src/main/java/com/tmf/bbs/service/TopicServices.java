package com.tmf.bbs.service;

import javax.servlet.http.HttpServletRequest;

public interface TopicServices {
	void getIndexHotTopic(HttpServletRequest request);

	void getIndexNiceTopic(HttpServletRequest request);

	void getIndexFreshTopic(HttpServletRequest request);
}
