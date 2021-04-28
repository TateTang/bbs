package com.tmf.bbs.service;

import com.tmf.bbs.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户接口
 * @author Administrator
 *
 */
public interface UserServices {

	/**
	 * 查询用户对象 可以根据用户名和用户id查询
	 *
	 * @param request
	 * @param user
	 */
	void queryUser(HttpServletRequest request, User user);

	boolean queryUserByUserName(HttpServletRequest request, HttpServletResponse response, String username, String password);
}
