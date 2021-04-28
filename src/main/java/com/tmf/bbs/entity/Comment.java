package com.tmf.bbs.entity;

import java.util.Date;


/**
 * 回复 评论实体类
 * @author Administrator
 *
 */
public class Comment {
	private int id;		//回复Id
	private String content;//回复内容
	private int floor;//回复楼层
	private Date comment_time;//回复时间
	private int comments_user_id;//回复用户Id
	private int comments_topic_id;//回复帖子Id
	private int integral;//回复积分
	private int status;  //评论的状态，是否被删除，0表示没有，1表示被删除
	
	//多对一
	private Topic commentTopic;
	private User commentUser;
	
	public Topic getCommentTopic() {
		return commentTopic;
	}
	public void setCommentTopic(Topic commentTopic) {
		this.commentTopic = commentTopic;
	}
	public User getCommentUser() {
		return commentUser;
	}
	public void setCommentUser(User commentUser) {
		this.commentUser = commentUser;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public Date getComment_time() {
		return comment_time;
	}
	public void setComment_time(Date comment_time) {
		this.comment_time = comment_time;
	}
	public int getComments_user_id() {
		return comments_user_id;
	}
	public void setComments_user_id(int comments_user_id) {
		this.comments_user_id = comments_user_id;
	}
	public int getComments_topic_id() {
		return comments_topic_id;
	}
	public void setComments_topic_id(int comments_topic_id) {
		this.comments_topic_id = comments_topic_id;
	}
	public int getIntegral() {
		return integral;
	}
	public void setIntegral(int integral) {
		this.integral = integral;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", floor=" + floor + ", comment_time=" + comment_time + ", comments_user_id="
				+ comments_user_id + ", comments_topic_id=" + comments_topic_id + ", integral=" + integral + ", status="
				+ status + "]";
	}
}
