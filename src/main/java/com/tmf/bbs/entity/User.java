package com.tmf.bbs.entity;

import lombok.Data;
import lombok.ToString;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户实体类
 *
 * @author Administrator
 */
@Data
@ToString
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
    private int grade_integal = 0;// 升级分
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
}
