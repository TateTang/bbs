package com.hnrp.bbs.controls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hnrp.bbs.pojo.Comment;
import com.hnrp.bbs.services.CommentServices;

/**
 * comment控制层
 * @author Administrator
 *
 */
@Controller //注册
public class CommentController {
	
	@Autowired // 注入
	CommentServices services;
	//添加评论
		@RequestMapping("/addComment.do")
		public String add(Comment comment){
			return "success";
		}
		
		//删除评论信息
		@RequestMapping("/comment_Delete.do")
		public String delete(Integer commentId,Integer topicId){
			services.deleteComment(commentId, topicId);
			return "redirect:topic_goTopic.do?id="+topicId;
		}
}
