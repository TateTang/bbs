package com.tmf.bbs.service.impl;


import com.tmf.bbs.dao.UserDao;
import com.tmf.bbs.entity.User;
import com.tmf.bbs.service.UserServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service("userServicesImpl")
public class UserServicesImpl implements UserServices{

	@Resource
	UserDao userDao;
	
	/**
	 * 可根据Id和用户名查询用户是否存在
	 */
	public void queryUser(HttpServletRequest request, User user) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 用来用户登录
	 */
	public boolean queryUserByUserName(HttpServletRequest request, HttpServletResponse response,String username, String password) {
		// TODO Auto-generated method stub
//		System.out.println(username);
//		System.out.println(password);
		boolean flag=false;
		User user = userDao.queryUserByUserName(username, password);
		//System.out.println(user);
		if(user!=null) {
			flag = true;
			request.getSession().setAttribute("user", user);
		}else {
			request.setAttribute("msg", "输入的密码不正确,请重新输入");
			request.setAttribute("path", request.getContextPath()+"/login.jsp");
			try {
				request.getRequestDispatcher("common/success.jsp").forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

}
