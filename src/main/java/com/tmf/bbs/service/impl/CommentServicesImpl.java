package com.tmf.bbs.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tmf.bbs.dao.CommentDao;
import com.tmf.bbs.dao.TopicDao;
import com.tmf.bbs.service.CommentServices;


@Service("commentServicesImpl")
public class CommentServicesImpl implements CommentServices{
	@Resource //注入
	TopicDao topicDao;
	
	@Resource
	CommentDao commentDao;
	/**
	 * 删除评论 更新 comment_count
	 */
	public void deleteComment(Integer commentId, Integer topicId) {
		// TODO Auto-generated method stub
		if(commentDao.delete(commentId)>0) {
			topicDao.updateCommment_count(topicId);
		}
	}
}
