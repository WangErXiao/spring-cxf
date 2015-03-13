package com.yao.service.share;

import javax.jws.WebService;

/**
 * Created by root on 15-3-13.
 */
@WebService
public interface HelloService {
    public String say(String name);
}
