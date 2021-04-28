package com.tmf.bbs.entity;

import java.util.Set;

public class Category {
	private Integer id;
	private String name;
	private Integer count_topics;
	private Integer count_comments;
	
	//一对多 一个大板块有多个小板块
	private Set<Type> types;
	
	public Category() {
		super();
	}
	
	public Category(Integer id, String name, Integer count_topics, Integer count_comments) {
		super();
		this.id = id;
		this.name = name;
		this.count_topics = count_topics;
		this.count_comments = count_comments;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCount_topics() {
		return count_topics;
	}
	public void setCount_topics(Integer count_topics) {
		this.count_topics = count_topics;
	}
	public Integer getCount_comments() {
		return count_comments;
	}
	public void setCount_comments(Integer count_comments) {
		this.count_comments = count_comments;
	}
	public Set<Type> getTypes() {
		return types;
	}
	public void setTypes(Set<Type> types) {
		this.types = types;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", count_topics=" + count_topics + ", count_comments="
				+ count_comments + ", types=" + types + "]";
	}
	
}
