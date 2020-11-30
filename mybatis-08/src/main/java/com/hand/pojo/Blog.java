package com.hand.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Author L-ludongpeng
 * @Date 2020/11/30 11:41
 * @Description
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime; //属性名和字段名不一致
    private int views;
}
