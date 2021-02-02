package com.cloud.mall.service;

import com.cloud.mall.dao.UserDao;
import com.cloud.mall.model.User;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * User: Wang Pengfei
 * Date: 2021/2/2
 * Time: 下午5:10
 * Description: No Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getId(String id) {
        User user = userDao.getById(id);
        System.out.println(user);
        return user;
    }
}
