package com.tmf.bbs.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户实体类
 * @author Administrator
 *
 */
public class User {
	  private int id; //用户id
	  private String username; //用户名
	  private String password;// 密码
	  private String nickname;// 呢称
	  private String sex;// 性别
	  private String picture;// 图片路径
	  private String email;// 邮箱
	  private String come_from;// 现居地
	  private String introduction;//` longtext,
	  private String profession;// 专业
	  private int  grade_integal = 0;// 升级分
	  private int integral = 50;// 积分
	  private int clock = 0;// 消息已读为1
	  private int topic_count = 0;// 帖子数
	  private int comment_count = 0;// 评论数
	  private int role_id = 0;// 角色id
	  private Date register_time;// 注册时间
	  private int status = 0;// 是否禁用
	  
	  
	  //多对一 一个等级有多个用户
	  private Grade userGrade; 
	  
	  //一对多   (有什么用？？？？？)
	  //一个用户 多个消息 多个帖子 多个评论
	  private Set<Topic> topicSet = new HashSet<Topic>();
	  private Set<New> newSet = new HashSet<New>();
	  private Set<Comment> commentSet = new HashSet<Comment>();
	
	  public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getPicture() {
			return picture;
		}
		public void setPicture(String picture) {
			this.picture = picture;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCome_from() {
			return come_from;
		}
		public void setCome_from(String come_from) {
			this.come_from = come_from;
		}
		public String getIntroduction() {
			return introduction;
		}
		public void setIntroduction(String introduction) {
			this.introduction = introduction;
		}
		public String getProfession() {
			return profession;
		}
		public void setProfession(String profession) {
			this.profession = profession;
		}
		public int getGrade_integal() {
			return grade_integal;
		}
		public void setGrade_integal(int grade_integal) {
			this.grade_integal = grade_integal;
		}
		public int getIntegral() {
			return integral;
		}
		public void setIntegral(int integral) {
			this.integral = integral;
		}
		public int getClock() {
			return clock;
		}
		public void setClock(int clock) {
			this.clock = clock;
		}
		public int getTopic_count() {
			return topic_count;
		}
		public void setTopic_count(int topic_count) {
			this.topic_count = topic_count;
		}
		public int getComment_count() {
			return comment_count;
		}
		public void setComment_count(int comment_count) {
			this.comment_count = comment_count;
		}
		public int getRole_id() {
			return role_id;
		}
		public void setRole_id(int role_id) {
			this.role_id = role_id;
		}
		public Date getRegister_time() {
			return register_time;
		}
		public void setRegister_time(Date register_time) {
			this.register_time = register_time;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public Grade getUserGrade() {
			return userGrade;
		}
		public void setUserGrade(Grade userGrade) {
			this.userGrade = userGrade;
		}
		public Set<Topic> getTopicSet() {
			return topicSet;
		}
		public void setTopicSet(Set<Topic> topicSet) {
			this.topicSet = topicSet;
		}
		public Set<New> getNewSet() {
			return newSet;
		}
		public void setNewSet(Set<New> newSet) {
			this.newSet = newSet;
		}
		public Set<Comment> getCommentSet() {
			return commentSet;
		}
		public void setCommentSet(Set<Comment> commentSet) {
			this.commentSet = commentSet;
		}
		
		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname
					+ ", sex=" + sex + ", picture=" + picture + ", email=" + email + ", come_from=" + come_from
					+ ", introduction=" + introduction + ", profession=" + profession + ", grade_integal="
					+ grade_integal + ", integral=" + integral + ", clock=" + clock + ", topic_count=" + topic_count
					+ ", comment_count=" + comment_count + ", role_id=" + role_id + ", register_time=" + register_time
					+ ", status=" + status + "]";
		}
	  
	  
	  
}
