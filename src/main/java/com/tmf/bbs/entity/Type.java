package com.tmf.bbs.entity;


import lombok.Data;
import lombok.ToString;

/**
 * С���
 *
 * @author
 */
@Data
@ToString
public class Type {

    private int id;//
    private String name;//
    private int count_topics;//
    private int count_comments;//
    private int is_admin_type;//
    private int types_category_id;//

    private Category typeCategory;
}
