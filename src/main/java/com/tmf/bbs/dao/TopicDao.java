package com.tmf.bbs.dao;

import com.tmf.bbs.entity.Topic;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TopicDao {
    /**
     * 后台帖子管理查询方法（全部帖子）
     *
     * @param iindexPage
     * @return List
     */
    List<Topic> queryAll(Integer indexPage);

    /**
     * 我要发帖具体实现方法
     *
     * @param topic
     * @return
     */
    int add(Topic topic);

    /**
     * 后台修改帖子为精帖
     *
     * @param topic
     * @return
     */
    int updateToNice(Topic topic);


    /**
     * 后台修改帖子不为精帖
     *
     * @param topic
     * @return
     */
    int update(Topic topic);

    /**
     * 全部帖子查询方法
     *
     * @param row//当前页码数
     * @return
     */
    @Select("select * from t_topic")
    @ResultMap("com.tmf.bbs.mappers.postMap.topicBean")
    List<Topic> getAllTopic(RowBounds row);


    /**
     * 热帖查询方法
     *
     * @param row//当前页码数
     * @return
     */
    @Select("select * from t_topic  where comment_count>=3 ORDER BY comment_count DESC ")
    @ResultMap("com.tmf.bbs.mappers.postMap.topicBean")
    List<Topic> getHotTopic(RowBounds row);


    /**
     * 精帖查询方法
     *
     * @param row
     * @return
     */
    @Select("select * from t_topic where nice_topic=1")
    @ResultMap("com.tmf.bbs.mappers.postMap.topicBean")
    List<Topic> nicePage(RowBounds row);


    //首页的热帖
    @Select("select * from t_topic  where comment_count>=3 ORDER BY comment_count DESC limit 0,10")
    @ResultMap("com.tmf.bbs.mappers.postMap.topicBean")
    List<Topic> getIndexHotTopic();

    //首页的精贴
    @Select("select * from t_topic where nice_topic=1 limit 0,10")
    @ResultMap("com.tmf.bbs.mappers.postMap.topicBean")
    List<Topic> getIndexNiceTopic();

    //首页的新帖
    @Select("select * from t_topic ORDER BY topic_time DESC limit 0,10")
    @ResultMap("com.tmf.bbs.mappers.postMap.topicBean")
    List<Topic> getIndexFreshTopic();

    /**
     * 分页查询帖子
     *
     * @param topic
     * @return
     */
    @Select("select count(1) from t_topic")
    int countTopic();


    /**
     * 查询热贴分页
     *
     * @return
     */
    @Select("select count(1) from t_topic  where comment_count>=3 ORDER BY comment_count DESC")
    int countTopicByHot();

    /**
     * 查询精品贴分页
     *
     * @return
     */
    @Select("select count(1) from t_topic where nice_topic=1")
    int countTopicByNice();

    /**
     * 新帖查询方法
     *
     * @param indexPage
     * @return
     */
    List<Topic> newPage(Integer indexPage);

    /**
     * 删除方法
     *
     * @param topic
     * @return
     */
    int delete(Topic topic);


    /**
     * 根据userId 来查询个人的帖子
     *
     * @param userId
     * @param currentPage
     * @return List<Topic>
     */
    List<Topic> queryByUserId(Integer userId, Integer currentPage);

    /**
     * 根据topicId查询帖子的具体信息
     *
     * @param topicId
     * @return
     */
    @Select("select * from t_topic where id=#{id}")
    @ResultMap("com.tmf.bbs.mappers.postMap.topicBean")
    Topic queryByTopicId(Integer topicId);


    /**
     * 根据topicId更新帖子中的Comment_count的值
     *
     * @param topicId
     * @return
     */
    @Update("update t_topic set comment_count=comment_count-1 where id=#{topicId}")
    int updateCommment_count(Integer topicId);

}
