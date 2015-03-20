package com.yao.service.share;

import javax.jws.WebService;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Created by root on 15-3-13.
 */
@Path("/helloService")
@WebService
public interface HelloService {
    @POST
    @Path("/say")
    public String say(String name);
}
