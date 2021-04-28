package com.tmf.bbs.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 帮助信息实体类
 *
 * @author Administrator
 */
@Data
@ToString
public class Help {
    private Integer id;
    private String title;
    private String content;
    private Date newtime;
}
