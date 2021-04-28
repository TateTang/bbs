package com.tmf.bbs.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;


@Data
@ToString
public class New {

    private int id;
    private Date new_time;//消息时间
    private int news_comment_user_id;//回复消息的用户id
    private int news_topic_id;//回复消息的帖子id
    private int status; // 0表示未读，1表示已读
}
