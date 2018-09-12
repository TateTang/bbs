package com.tmf.bbs.pojo;

import java.util.Date;

/**
 * 公告实体类
 * @author Administrator
 *
 */
public class Announce {
	private Integer id;
	private String announcement;
	private String title;
	private Date newtime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAnnouncement() {
		return announcement;
	}
	public void setAnnouncement(String announcement) {
		this.announcement = announcement;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getNewtime() {
		return newtime;
	}
	public void setNewtime(Date newtime) {
		this.newtime = newtime;
	}
	@Override
	public String toString() {
		return "Announce [id=" + id + ", announcement=" + announcement + ", title=" + title + ", newtime=" + newtime
				+ "]";
	}
	
}
