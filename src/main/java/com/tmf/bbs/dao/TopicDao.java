package com.tmf.bbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

import com.tmf.bbs.pojo.Topic;

public interface TopicDao {
		/**
		 * 后台帖子管理查询方法（全部帖子）
		 * @param id用户id
		 * @return List
		 */
		public List<Topic> queryAll(Integer indexPage);
		
		/**
		 * 我要发帖具体实现方法
		 * @param topic
		 * @return
		 */
		public int add(Topic topic);
		
		/**
		 *后台修改帖子为精帖
		 * @param topic
		 * @return
		 */
		public int updateToNice(Topic topic);
		
		
		/**
		 * 后台修改帖子不为精帖
		 * @param topic
		 * @return
		 */
		public int update(Topic topic);
		/**
		 * 全部帖子查询方法
		 * @param indexPage//当前页码数
		 * @return
		 */
		@Select("select * from t_topic")
		@ResultMap("com.tmf.bbs.mappers.postMap.topicBean")
		public List<Topic> getAllTopic(RowBounds row);
		
		
		
		
		/**
		 *热帖查询方法
		 * @param indexPage//当前页码数
		 * @return
		 */
		@Select("select * from t_topic  where comment_count>=3 ORDER BY comment_count DESC ")
		@ResultMap("com.tmf.bbs.mappers.postMap.topicBean")
		public List<Topic> getHotTopic(RowBounds row);
		
		
		
		/**
		 * 精帖查询方法
		 * @param indexPage
		 * @return
		 */
		@Select("select * from t_topic where nice_topic=1")
		@ResultMap("com.tmf.bbs.mappers.postMap.topicBean")
		public List<Topic> nicePage(RowBounds row);
		
		
		
		//首页的热帖
		@Select("select * from t_topic  where comment_count>=3 ORDER BY comment_count DESC limit 0,10")
		@ResultMap("com.tmf.bbs.mappers.postMap.topicBean")
		public List<Topic> getIndexHotTopic();
		
		//首页的精贴
		@Select("select * from t_topic where nice_topic=1 limit 0,10")
		@ResultMap("com.tmf.bbs.mappers.postMap.topicBean")
		public List<Topic> getIndexNiceTopic();
		
		//首页的新帖
		@Select("select * from t_topic ORDER BY topic_time DESC limit 0,10")
		@ResultMap("com.tmf.bbs.mappers.postMap.topicBean")
		public List<Topic> getIndexFreshTopic();
		/**
		 * 分页查询帖子
		 * @param topic
		 * @return
		 */
		@Select("select count(1) from t_topic")
		public int countTopic();
		
		
		/**
		 * 查询热贴分页
		 * @return
		 */
		@Select("select count(1) from t_topic  where comment_count>=3 ORDER BY comment_count DESC")
		public int countTopicByHot();
		/**
		 * 查询精品贴分页
		 * @return
		 */
		@Select("select count(1) from t_topic where nice_topic=1")
		public int countTopicByNice();
		
		/**
		 * 新帖查询方法
		 * @param indexPage
		 * @return
		 */
		public List<Topic> newPage(Integer indexPage) ;
		
		/**
		 *删除方法
		 * @param topic
		 * @return
		 */
		public int delete(Topic topic);
		
		
		/**
		 * 根据userId 来查询个人的帖子
		 * @param userId
		 * @param currentPage
		 * @return List<Topic>
		 */
		public List<Topic> queryByUserId(Integer userId,Integer currentPage);
		
		/**
		 * 根据topicId查询帖子的具体信息
		 * @param topicId
		 * @return
		 */
		@Select("select * from t_topic where id=#{id}")
		@ResultMap("com.tmf.bbs.mappers.postMap.topicBean")
		public Topic queryByTopicId(Integer topicId);
		
		
		/**
		 * 根据topicId更新帖子中的Comment_count的值
		 * @param topicId
		 * @return
		 */
		@Update("update t_topic set comment_count=comment_count-1 where id=#{topicId}")
		public int updateCommment_count(Integer topicId);
		
}
