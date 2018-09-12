package com.hnrp.bbs.services;


import javax.servlet.http.HttpServletRequest;
/**
 * 帖子接口
 * @author Administrator
 *
 */
public interface PostServices {
	/**
	 * 热门帖查询		根据点击率从大到小查询十条分页	
	 * @param countComment
	 * @return
	 */
	public void getHotTopic(HttpServletRequest request, Integer indexPage);
	
	/**
	 * 精品贴查询
	 * @param indexPage
	 * @return
	 */
	public void getNiceTopic(HttpServletRequest request,Integer indexPage);
	
	/**
	 * 全部帖子查询
	 * @param indexPage
	 * @return
	 */
	public void getAllTopic(HttpServletRequest request,Integer indexPage);
	
	/**
	 * 进入到帖子的具体页面
	 * @param request
	 * @param topicId
	 */
	public void goTopic(HttpServletRequest request,Integer topicId,Integer indexPage);
}
