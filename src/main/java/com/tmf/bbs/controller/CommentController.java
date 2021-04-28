package com.tmf.bbs.controller;

import com.tmf.bbs.entity.Comment;
import com.tmf.bbs.service.CommentServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * comment控制层
 *
 * @author Administrator
 */
@Controller // 注册
public class CommentController {

    @Resource(name = "commentServicesImpl")
    CommentServices services;

    // 添加评论
    @RequestMapping("/addComment.do")
    public String add(Comment comment) {
        return "success";
    }

    // 删除评论信息
    @RequestMapping("/comment_Delete.do")
    public String delete(Integer commentId, Integer topicId) {
        services.deleteComment(commentId, topicId);
        return "redirect:topic_goTopic.do?id=" + topicId;
    }
}
