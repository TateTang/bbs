package com.hnrp.bbs.pojo;

import java.util.Date;

public class New {
	@Override
	public String toString() {
		return "New [id=" + id + ", new_time=" + new_time + ", news_comment_user_id=" + news_comment_user_id
				+ ", news_topic_id=" + news_topic_id + ", status=" + status + "]";
	}
	private int id;
	private Date new_time;//消息时间
	private int news_comment_user_id;//回复消息的用户id
	private int news_topic_id;//回复消息的帖子id
	private int status; // 0表示未读，1表示已读
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getNew_time() {
		return new_time;
	}
	public void setNew_time(Date new_time) {
		this.new_time = new_time;
	}
	public int getNews_comment_user_id() {
		return news_comment_user_id;
	}
	public void setNews_comment_user_id(int news_comment_user_id) {
		this.news_comment_user_id = news_comment_user_id;
	}
	public int getNews_topic_id() {
		return news_topic_id;
	}
	public void setNews_topic_id(int news_topic_id) {
		this.news_topic_id = news_topic_id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
