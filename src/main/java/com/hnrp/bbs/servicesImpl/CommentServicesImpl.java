package com.hnrp.bbs.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnrp.bbs.dao.CommentDao;
import com.hnrp.bbs.dao.TopicDao;
import com.hnrp.bbs.services.CommentServices;


@Service
public class CommentServicesImpl implements CommentServices{
	@Autowired //注入
	TopicDao topicDao;
	
	@Autowired
	CommentDao commentDao;
	/**
	 * 删除评论 更新 comment_count
	 */
	@Override
	public void deleteComment(Integer commentId, Integer topicId) {
		// TODO Auto-generated method stub
		if(commentDao.delete(commentId)>0) {
			topicDao.updateCommment_count(topicId);
		}
	}
}
