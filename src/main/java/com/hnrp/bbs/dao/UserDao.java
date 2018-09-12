package com.hnrp.bbs.dao;

import java.util.List;

import com.hnrp.bbs.pojo.Comment;
import com.hnrp.bbs.pojo.New;
import com.hnrp.bbs.pojo.Topic;
import com.hnrp.bbs.pojo.User;

/**
 * 关于用户表的查询
 * @author ls
 *
 */
public interface UserDao {
    
	/**
	 * 通用的查询方法         可以根据用户名和用户的id来查询 
	 * @return User
	 */
	public User queryUser(User userP);
	
	/**
	 * 根据一个 User对象插入一组数据
	 * @param user
	 * @return
	 */
	public Integer insertUser(User user);
	
    
    /**
     * 根据userId 来修改 用户信息
     * @param user
     * @return Integer
     */
    public Integer updateByUserId(User user);
    

    
    //------------------------------------------
    
    /**
     * 查询所有的用户信息  （分页）
     * @return List<User>
     */
    public List<User> queryAllUser(int currentPage);
    
    /**
     * 查询用户的所有评论
     * @param currentPage   当前页面
     * @return  List<Comment>
     */
    public List<Comment> querySelfComment(int currentPage,User user);
    
    /**
     * 查询用户的所有消息
     * @param currentPage   当前页面
     * @return  List<New>
     */
    public List<New> querySelfNew(int currentPage,User user);
    
    /**
     * 查询用户的所有的帖子
     * @param currentPage   当前页面
     * @return  List<Topic>
     */
    public List<Topic> querySelfTopic(int currentPage,User user);

}
