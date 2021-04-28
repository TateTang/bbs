package com.tmf.bbs.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.tmf.bbs.dao.TopicDao;
import com.tmf.bbs.entity.Topic;
import com.tmf.bbs.service.TopicServices;

@Service("topicServicesImpl")
public class TopicServicesImpl implements TopicServices{
	@Resource
	TopicDao topicDao;
	
	//热帖
	@Override
	public void getIndexHotTopic(HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<Topic> indexHotTopic = topicDao.getIndexHotTopic();
		request.setAttribute("indexHotTopic", indexHotTopic);
	}

	//精贴
	@Override
	public void getIndexNiceTopic(HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<Topic> indexNiceTopic = topicDao.getIndexNiceTopic();
		request.setAttribute("indexNiceTopic", indexNiceTopic);
	}

	
	//新帖
	@Override
	public void getIndexFreshTopic(HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<Topic> indexFreshTopic = topicDao.getIndexFreshTopic();
		request.setAttribute("indexFreshTopic", indexFreshTopic);
	}
	
	
	
}
