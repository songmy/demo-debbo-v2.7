package com.xmxl.dubbo.helloworld.api.service;

import com.xmxl.dubbo.helloworld.api.entity.User;

/**
 * @author songmy
 */
public interface IUserService {

    User getUser(long userId);

}
