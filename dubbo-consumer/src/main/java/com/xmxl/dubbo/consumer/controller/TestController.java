package com.xmxl.dubbo.consumer.controller;

import com.xmxl.dubbo.helloworld.api.entity.User;
import com.xmxl.dubbo.helloworld.api.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songmy
 */
@RestController
public class TestController {
    @Reference
    private IUserService userService;

    @GetMapping(value = "test")
    public User testHelloWorld(long userId) {
        return userService.getUser(userId);
    }
}
