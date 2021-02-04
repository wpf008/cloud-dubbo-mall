package com.cloud.mall.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.cloud.mall.model.User;
import com.cloud.mall.service.UserService;
import lombok.extern.log4j.Log4j2;
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
@Log4j2
public class UserController {

    @Reference
    private UserService userService;

    @SentinelResource(value = "/get/{id}", fallback = "fallbackHandler")
    @GetMapping("/get/{id}")
    public User get(@PathVariable("id") String id) {
        return userService.getId(id);
    }


    public User fallbackHandler(String id) {
        log.error("fallbackHandler：" + id);
        return new User();
    }

    @GetMapping("/set")
    public String get() {
        return "set";
    }


}
