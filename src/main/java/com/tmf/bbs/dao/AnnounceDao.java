package com.tmf.bbs.dao;

import com.tmf.bbs.entity.Announce;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AnnounceDao {

    @Select("select * from t_announce limit 0,5")
    List<Announce> getIndexAnno();

    @Select("select * from t_announce")
    List<Announce> getAllAnno();

    @Select("select * from t_announce where id=#{id}")
    Announce getAnnoById(Integer id);

    @Select("select count(1) annosize from t_announce")
    int countAnno();
}
