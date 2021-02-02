package com.cloud.mall.controller;

import com.cloud.mall.model.User;
import com.cloud.mall.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Wang Pengfei
 * Date: 2021/2/2
 * Time: 下午5:18
 * Description: No Description
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/{id}")
    public User get(@PathVariable("id") String id) {
        return userService.getId(id);
    }


}
