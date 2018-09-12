package com.tmf.bbs.pojo;


import java.util.Date;
import java.util.Set;

/**
 * 帖子实体类
 * @author zjshen
 *
 */
public class Topic {
	  private Integer id ;
	  private String title;
	  private String content;
	  private Integer comment_count;
	  private Integer status;
	  private Date topic_time;
	  private Integer topics_user_id;
	  private Integer topics_type_id;
	  private Integer nice_topic;
	  private Integer integral;
	  //集合 多对一
	  //一个用户有多个帖子  一个类型有多个帖子
	  private User topicUser;
	  private Type topicType;
	  
	  //一对多
	  private Set<Comment> topicComment;
	  private Set<New> topicNew;
	  
	 
	public Set<Comment> getTopicComment() {
		return topicComment;
	}
	public void setTopicComment(Set<Comment> topicComment) {
		this.topicComment = topicComment;
	}
	public Set<New> getTopicNew() {
		return topicNew;
	}
	public void setTopicNew(Set<New> topicNew) {
		this.topicNew = topicNew;
	}
	public User getTopicUser() {
		return topicUser;
	}
	public void setTopicUser(User topicUser) {
		this.topicUser = topicUser;
	}
	public Type getTopicType() {
		return topicType;
	}
	public void setTopicType(Type topicType) {
		this.topicType = topicType;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getComment_count() {
		return comment_count;
	}
	public void setComment_count(Integer comment_count) {
		this.comment_count = comment_count;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	public Date getTopic_time() {
		return topic_time;
	}
	public void setTopic_time(Date topic_time) {
		this.topic_time = topic_time;
	}
	public Integer getTopics_user_id() {
		return topics_user_id;
	}
	public void setTopics_user_id(Integer topics_user_id) {
		this.topics_user_id = topics_user_id;
	}
	public Integer getTopics_type_id() {
		return topics_type_id;
	}
	public void setTopics_type_id(Integer topics_type_id) {
		this.topics_type_id = topics_type_id;
	}
	public Integer getNice_topic() {
		return nice_topic;
	}
	public void setNice_topic(Integer nice_topic) {
		this.nice_topic = nice_topic;
	}
	public Integer getIntegral() {
		return integral;
	}
	public void setIntegral(Integer integral) {
		this.integral = integral;
	}
	@Override
	public String toString() {
		return "Topic [id=" + id + ", title=" + title + " comment_count=" + comment_count
				+ ", status=" + status + ", topic_time=" + topic_time + ", topics_user_id=" + topics_user_id
				+ ", topics_type_id=" + topics_type_id + ", nice_topic=" + nice_topic + ", integral=" + integral + "]";
	}
	
	
}
