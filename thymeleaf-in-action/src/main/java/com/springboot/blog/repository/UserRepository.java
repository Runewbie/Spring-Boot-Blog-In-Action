package com.springboot.blog.repository;

import com.springboot.blog.domain.User;

import java.util.List;

/**
 * @author: li_jian
 * @version: 1.0
 * @date: 2019/11/21 23:30
 * @description： 用户仓库接口
 */
public interface UserRepository {

    /**
     * 新增或者修改用户
     *
     * @param user
     * @return
     */
    User saveOrUpdateUser(User user);

    /**
     * 删除用户
     *
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 根据用户id获取用户
     *
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 获取所有用户的列表
     *
     * @return
     */
    List<User> listUser();
}

