package com.tmf.bbs.controller;


import com.tmf.bbs.service.PostServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 帖子的管理
 *
 * @author Administrator
 */
@Controller // 注册
public class PostController {

    @Resource(name = "postServicesImpl")
    PostServices services;

    // 热帖的查询
//	@RequestMapping("/topic_GetHotTopic.action")
//	public String queryHot(HttpServletRequest request,Integer indexPage){
//		HashMap<String, Object> params = services.getHotTopic(1);
//		
//		List<Topic> hotList = (List<Topic>) params.get("hotList");
//		for (Topic topic : hotList) {
//			System.out.println(topic);
//		}
//		request.setAttribute("page", params.get("page"));
//		request.setAttribute("hotList", hotList);
//		return "hotTopic";
//	}

    // 热帖的查询
    @RequestMapping("/topic_GetHotTopic.do")
    public String queryHot(HttpServletRequest request, Integer indexPage) {
        if (indexPage == null) {
            indexPage = 1;
        }
        services.getHotTopic(request, indexPage);
        return "hotTopic";
    }

    // 精贴的查询
    @RequestMapping("/topic_GetNiceTopic.do")
    public String queryNice(HttpServletRequest request, Integer indexPage) {
        if (indexPage == null) {
            indexPage = 1;
        }
        services.getNiceTopic(request, indexPage);
        return "niceTopic";
    }

    //全部帖子的查询
    @RequestMapping("/topic_GetAllTopic.do")
    public String queryAll(HttpServletRequest request, Integer indexPage) {
        if (indexPage == null) {
            indexPage = 1;
        }
        services.getAllTopic(request, indexPage);
        return "allTopic";
    }

    //进入到帖子具体页面
    @RequestMapping("/topic_goTopic.do")
    public String goTopic(HttpServletRequest request, Integer id, Integer indexPage) {
        if (indexPage == null) {
            indexPage = 1;
        }
        //System.out.println(id);
        services.goTopic(request, id, indexPage);
        return "u/theTopic";
    }
}
