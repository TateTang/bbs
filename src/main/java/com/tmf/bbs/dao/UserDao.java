package com.tmf.bbs.dao;

import com.tmf.bbs.entity.Comment;
import com.tmf.bbs.entity.New;
import com.tmf.bbs.entity.Topic;
import com.tmf.bbs.entity.User;
import com.tmf.bbs.util.UserSqlUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 关于用户表的查询
 *
 * @author ls
 */
public interface UserDao {

    /**
     * 通用的查询方法         可以根据用户名和用户的id来查询
     *
     * @return User
     */
    @SelectProvider(type = UserSqlUtils.class, method = "selectWithParamSql")
    User queryUser(User user);

    @Select("select * from t_user where username=#{username} and password=#{password}")
    @RequestMapping("com.tmf.bbs.mappers.userMap.userBean")
    User queryUserByUserName(@Param("username") String username, @Param("password") String password);

    /**
     * 根据一个 User对象插入一组数据
     *
     * @param user
     * @return
     */
    Integer insertUser(User user);


    /**
     * 根据userId 来修改 用户信息
     *
     * @param user
     * @return Integer
     */
    Integer updateByUserId(User user);


    //------------------------------------------

    /**
     * 查询所有的用户信息  （分页）
     *
     * @return List<User>
     */
    List<User> queryAllUser(int currentPage);

    /**
     * 查询用户的所有评论
     *
     * @param currentPage 当前页面
     * @return List<Comment>
     */
    List<Comment> querySelfComment(int currentPage, User user);

    /**
     * 查询用户的所有消息
     *
     * @param currentPage 当前页面
     * @return List<New>
     */
    List<New> querySelfNew(int currentPage, User user);

    /**
     * 查询用户的所有的帖子
     *
     * @param currentPage 当前页面
     * @return List<Topic>
     */
    List<Topic> querySelfTopic(int currentPage, User user);

}
