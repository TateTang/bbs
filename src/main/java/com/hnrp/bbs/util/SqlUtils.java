//package com.hnrp.bbs.util;
//
//import org.apache.ibatis.jdbc.SQL;
//
//import com.hnrp.bbs.pojo.Comment;
//
//public class SqlUtils {
//	//方法中的关键字区分大小写 SQL WHERE SELECT
//	//该方法会根据传递过来的map中的参数内容,动态构建Sql语句
//	/**
//	 * 动态插入方法
//	 * @param param
//	 * @return
//	 */
//	public String insertWithParamSql(final Comment param){
//		return new SQL(){
//			{
//				INSERT_INTO("t_user");
//				if(param.getId()>0){
//					VALUES("id", "#{id}");
//				}
//				if(param.getUsername()!=null){
//					VALUES("username", "#{username}");
//				}
//				if(param.getNickname()!=null){
//					VALUES("nickname", "#{nickname}");
//				}
//				if(param.getSex()!=null){
//					VALUES("sex", "#{sex}");
//				}
//					VALUES("users_grade_id", "1");
//			}
//		}.toString();
//	}
//	/**
//	 * 动态删除
//	 * @param id
//	 * @return
//	 */
//	public String deleteWithParamSql(int id){
//		return new SQL(){
//			{
//				DELETE_FROM("t_user");
//				WHERE("id=#{id}");
//			}
//		}.toString();
//	}
//
//	/**
//	 * 动态更新方法
//	 * @param param
//	 * @return
//	 */
//	public String updateWithParamSql(final Comment param){
//		return new SQL(){
//			{
//				UPDATE("t_user");
//				if(param.getUsername()!=null){
//					SET("username=#{username}");
//				}
//				if(param.getNickname()!=null){
//					SET("nickname=#{nickname}");
//				}
//				if(param.getSex()!=null){
//					SET("sex=#{sex}");
//				}
//				WHERE("id=#{id}");
//			}
//		}.toString();
//	}
//
//	/**
//	 * 动态查询方法 传递的id和username id准确查询 username模糊查询
//	 * @param param
//	 * @return
//	 */
//	public String selectWithParamSql(final Comment param){
//		return new SQL(){
//			{
//				SELECT("id,username,nickname,sex");
//				FROM("t_user");
//				if(param.getId()>0){
//					WHERE("id=#{id}");
//				}
//				if(param.getUsername()!=null){
//					WHERE("username=#{username}");
//				}
//			}
//		}.toString();
//	}
//	
//}
