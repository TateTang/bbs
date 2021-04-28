package com.tmf.bbs.dao;

import com.tmf.bbs.entity.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @author tmf
 * 评论 回复 dao层数据访问接口
 */
public interface CommentDao {
    /**
     * 查询所有评论
     *
     * @return
     */
    List<Comment> queryCommentByList();

    /**
     * 根据帖子id,查询评论
     *
     * @return
     */
    @Select("select * from t_comment where comments_topic_id=#{comments_topic_id}")
    List<Comment> queryCommentByTopicId(Integer comments_topic_id, RowBounds row);

    @Select("select count(1) from t_comment where comments_topic_id=#{comments_topic_id}")
    int countByTopicId(Integer comments_topic_id);

    /**
     * 根据回复id查询回复
     *
     * @param id
     * @return
     */
    Comment find(Integer id);

    /**
     * 添加回复
     *
     * @param comment
     * @return
     */
    int add(Comment comment);

    /**
     * 更新回复
     *
     * @param comment
     * @return
     */
    int update(Comment comment);

    /**
     * 删除回复
     *
     * @param commentId
     * @return
     */

    @Delete("delete from t_comment where id=#{commentId}")
    int delete(Integer commentId);


}
