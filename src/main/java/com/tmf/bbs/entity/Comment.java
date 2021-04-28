package com.tmf.bbs.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;


/**
 * 回复 评论实体类
 *
 * @author Administrator
 */
@Data
@ToString
public class Comment {
    private int id;        //回复Id
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
}
