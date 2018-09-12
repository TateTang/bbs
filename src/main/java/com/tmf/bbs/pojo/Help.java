package com.tmf.bbs.pojo;

import java.util.Date;

/**
 * 帮助信息实体类
 * @author Administrator
 *
 */
public class Help {
	private Integer id;
	private String title;
	private String content;
	private Date newtime;
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
	public Date getNewtime() {
		return newtime;
	}
	public void setNewtime(Date newtime) {
		this.newtime = newtime;
	}
	@Override
	public String toString() {
		return "Help [id=" + id + ", title=" + title + ", content=" + content + ", newtime=" + newtime + "]";
	}
	
}
