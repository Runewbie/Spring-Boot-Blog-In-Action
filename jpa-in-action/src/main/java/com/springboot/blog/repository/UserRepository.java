package com.springboot.blog.repository;

import com.springboot.blog.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author: li_jian
 * @version: 1.0
 * @date: 2019/11/21 23:30
 * @description： 用户仓库接口
 */
public interface UserRepository extends CrudRepository<User, Long> {

}

