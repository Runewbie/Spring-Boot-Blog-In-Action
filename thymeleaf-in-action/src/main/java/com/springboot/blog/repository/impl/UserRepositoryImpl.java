package com.springboot.blog.repository.impl;

import com.springboot.blog.domain.User;
import com.springboot.blog.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: li_jian
 * @version: 1.0
 * @date: 2019/11/21 23:38
 * @description： 用户资源库实现
 */
@Repository // 别忘了注入bean
public class UserRepositoryImpl implements UserRepository {

    /**
     * 因为用户 Id 唯一，我们可以使用 AtomicLong 来每一次递增一个数生成用户 id。
     */
    private static AtomicLong counter = new AtomicLong();
    /**
     * 因为我们现在还没有使用数据库，所以我们可以先将用户的数据存储在一个 MAP中，我们这里使用ConcurrentHashMap来存储。
     */
    private final ConcurrentMap<Long, User> userMap = new ConcurrentHashMap<>();

    @Override
    public User saveOrUpdateUser(User user) {
        Long id = user.getId();
        // 新建
        if (id == null) {
            // id自增
            id = counter.incrementAndGet();
            user.setId(id);
        }
        this.userMap.put(id, user);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        this.userMap.remove(id);
    }

    @Override
    public User getUserById(Long id) {
        return this.userMap.get(id);
    }

    @Override
    public List<User> listUser() {
        return new ArrayList<User>(this.userMap.values());
    }

}
