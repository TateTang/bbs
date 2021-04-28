package com.tmf.bbs.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Set;

@Data
@ToString
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
}
