package com.yao.service.impl;

import com.yao.service.share.HelloService;

/**
 * Created by root on 15-3-13.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String say(String name) {
        return "hello "+name;
    }
}
