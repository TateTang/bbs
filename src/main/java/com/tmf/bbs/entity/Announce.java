package com.tmf.bbs.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 公告实体类
 *
 * @author Administrator
 */
@Data
@ToString
public class Announce {
    private Integer id;
    private String announcement;
    private String title;
    private Date newtime;
}
