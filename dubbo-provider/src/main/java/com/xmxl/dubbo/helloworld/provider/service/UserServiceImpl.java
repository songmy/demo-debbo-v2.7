package com.xmxl.dubbo.helloworld.provider.service;

import com.xmxl.dubbo.helloworld.api.entity.User;
import com.xmxl.dubbo.helloworld.api.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author songmy
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    public User getUser(long userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName("songmy");
        return user;
    }
}
