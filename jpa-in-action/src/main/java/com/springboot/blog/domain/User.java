package com.springboot.blog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author: li_jian
 * @version: 1.0
 * @date: 2019/11/21 08:13
 * @description： 实体 User
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User implements Serializable{
    /** 用户的唯一标识 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
}
