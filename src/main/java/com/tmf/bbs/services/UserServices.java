package com.tmf.bbs.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tmf.bbs.pojo.User;

/**
 * 用户接口
 * @author Administrator
 *
 */
public interface UserServices {
	
	/**
	 * 查询用户对象 可以根据用户名和用户id查询
	 * @param request
	 * @param user
	 */
	public void queryUser(HttpServletRequest request,User user);
	
	public boolean queryUserByUserName(HttpServletRequest request,HttpServletResponse response,String username,String password);
}
