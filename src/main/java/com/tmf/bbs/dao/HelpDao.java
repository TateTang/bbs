package com.tmf.bbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.tmf.bbs.entity.Help;

public interface HelpDao {
	
	@Select("select * from t_help limit 0,5")
	public List<Help> getIndexHelp();
	
	@Select("select * from t_help")
	public List<Help> getAllHelp();
	
	@Select("select * from t_help where id=#{id}")
	public Help getHelpById(Integer id);
	
	@Select("select count(1) helpsize from t_help")
	public int countHelp();
} 
