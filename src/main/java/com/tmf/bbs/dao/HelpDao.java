package com.tmf.bbs.dao;

import com.tmf.bbs.entity.Help;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HelpDao {

    @Select("select * from t_help limit 0,5")
    List<Help> getIndexHelp();

    @Select("select * from t_help")
    List<Help> getAllHelp();

    @Select("select * from t_help where id=#{id}")
    Help getHelpById(Integer id);

    @Select("select count(1) helpsize from t_help")
    int countHelp();
} 
