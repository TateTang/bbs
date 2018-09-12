package com.hnrp.bbs.servicesImpl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnrp.bbs.dao.CommentDao;
import com.hnrp.bbs.dao.TopicDao;
import com.hnrp.bbs.pojo.Comment;
import com.hnrp.bbs.pojo.Topic;
import com.hnrp.bbs.services.PostServices;
import com.hnrp.bbs.util.Pages;

@Service //注册
public class PostServicesImpl implements PostServices{
	@Autowired //注入
	TopicDao topicDao;
	
	@Autowired
	CommentDao commentDao;
	/**
	 * 全部帖子
	 */
	@Override
	public void getAllTopic(HttpServletRequest request, Integer indexPage) {
			Integer count = topicDao.countTopic();
			Pages page = new Pages(count);
			page.setIndexPage(indexPage);
			page.setPageSize(10);
			RowBounds row = new RowBounds(page.getBeginRow(), page.getPageSize());
			
			List<Topic> allList = topicDao.getAllTopic(row);
			request.setAttribute("allpage",page);
			request.setAttribute("allList", allList);
	}
	
	//热帖
	public void getHotTopic(HttpServletRequest request,Integer indexPage) {
		Integer count = topicDao.countTopicByHot();
		Pages page = new Pages(count);
		page.setIndexPage(indexPage);
		page.setPageSize(10);
		RowBounds row = new RowBounds(page.getBeginRow(), page.getPageSize());
		
		List<Topic> hotList = topicDao.getHotTopic(row);
		request.setAttribute("hotpage", page);
		request.setAttribute("hotList", hotList);
	}
	//精贴
	public void getNiceTopic(HttpServletRequest request,Integer indexPage) {
		Integer count = topicDao.countTopicByNice();
		Pages page = new Pages(count);
		page.setIndexPage(indexPage);
		page.setPageSize(10);
		RowBounds row = new RowBounds(page.getBeginRow(), page.getPageSize());
		
		List<Topic> niceList = topicDao.nicePage(row);
		request.setAttribute("nicepage",page);
		request.setAttribute("niceList", niceList);
	}
	
	/**
	 * 去到帖子的具体界面 并且通过帖子id拿到评论的信息
	 */
	@Override
	public void goTopic(HttpServletRequest request, Integer topicId,Integer indexPage) {
		
		Integer count = commentDao.countByTopicId(topicId);
		Pages page = new Pages(count);
		page.setIndexPage(indexPage);
		page.setPageSize(10);
		RowBounds row = new RowBounds(page.getBeginRow(), page.getPageSize());
		
		Topic topic = topicDao.queryByTopicId(topicId);
		List<Comment> commentList = commentDao.queryCommentByTopicId(topicId,row);
		request.setAttribute("topic", topic);
		request.setAttribute("commentList", commentList);
		request.setAttribute("page", page);
	}
}
