package com.tmf.bbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.tmf.bbs.pojo.Announce;

public interface AnnounceDao {
	
	@Select("select * from t_announce limit 0,5")
	public List<Announce> getIndexAnno();
	
	@Select("select * from t_announce")
	public List<Announce> getAllAnno();
	
	@Select("select * from t_announce where id=#{id}")
	public Announce getAnnoById(Integer id);
	
	@Select("select count(1) annosize from t_announce")
	public int countAnno();
}
