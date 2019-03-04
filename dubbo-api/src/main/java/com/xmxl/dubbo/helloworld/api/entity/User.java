package com.xmxl.dubbo.helloworld.api.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author songmy
 */
@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = 7212252715909085859L;
    private long userId;
    private String userName;
}
