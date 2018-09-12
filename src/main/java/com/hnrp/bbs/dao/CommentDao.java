package com.hnrp.bbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import com.hnrp.bbs.pojo.Comment;

/**
 * 
 * @author tmf
 * 评论 回复 dao层数据访问接口
 * 
 */
public interface CommentDao {
	/**
	 * 查询所有评论
	 * @return
	 */
	public List<Comment> queryCommentByList();
	/**
	 * 根据帖子id,查询评论 
	 * @return
	 */
	@Select("select * from t_comment where comments_topic_id=#{comments_topic_id}")
	public List<Comment> queryCommentByTopicId(Integer comments_topic_id,RowBounds row);
	
	@Select("select count(1) from t_comment where comments_topic_id=#{comments_topic_id}")
	public int countByTopicId(Integer comments_topic_id);
	/**
	 * 根据回复id查询回复
	 * @param id
	 * @return
	 */
	public Comment find(Integer id);
	/**
	 * 添加回复
	 * @param comment
	 * @return
	 */
	public int add(Comment comment);

	/**
	 * 更新回复
	 * @param comments
	 * @return
	 */
	public int update(Comment comment);
	
	/**
	 * 删除回复
	 * @param comment
	 * @return
	 */
	
	@Delete("delete from t_comment where id=#{commentId}")
	public int delete(Integer commentId);
	

}
