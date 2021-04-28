package com.tmf.bbs.entity;


import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.Set;

/**
 * 帖子实体类
 *
 * @author zjshen
 */
@Data
@ToString
public class Topic {
    private Integer id;
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
}
