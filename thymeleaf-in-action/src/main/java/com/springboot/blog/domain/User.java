package com.springboot.blog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: li_jian
 * @version: 1.0
 * @date: 2019/11/21 08:13
 * @description： 实体 User
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /** 用户的唯一标识 */
    private Long id;
    private String name;
    private Integer age;
}
