package com.tmf.bbs.service;

/**
 * 评论回复 业务处理类
 * @author Administrator
 *
 */
public interface CommentServices {
	/**
	 * 删除评论 并且更新t_topic中的comment_count
	 * @param commentId
	 * @param topicId
	 */
	void deleteComment(Integer commentId, Integer topicId);
}
