package com.tmf.bbs.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tmf.bbs.service.TopicServices;
/**
 * 首页帖子管理
 * @author Administrator
 *
 */

@Controller
public class TopicController {
	@Resource(name="topicServicesImpl")
	TopicServices services;
	
	//首页中的热帖查询
	@RequestMapping("/topic_getIndexHotTopic.do")
	public String queryIndexHotTopic(HttpServletRequest request) {
		services.getIndexHotTopic(request);
		return "indexHotTopic";
	}
	
	//首页中的精贴查询
	@RequestMapping("/topic_getIndexNiceTopic.do")
	public String queryIndexNiceTopic(HttpServletRequest request) {
		services.getIndexNiceTopic(request);
		return "indexNiceTopic";
	}
	//首页中的新帖查询
	@RequestMapping("/topic_getIndexFreshTopic.do")
	public String queryIndexFreshTopic(HttpServletRequest request) {
		services.getIndexFreshTopic(request);
		return "indexFreshTopic";
	}
}
