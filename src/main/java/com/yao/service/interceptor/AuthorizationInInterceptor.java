package com.yao.service.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.transport.http.AbstractHTTPDestination;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by root on 15-3-17.
 */
public class AuthorizationInInterceptor extends AbstractPhaseInterceptor<Message> {

    public AuthorizationInInterceptor() {
        super(Phase.RECEIVE);
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        HttpServletRequest request = (HttpServletRequest) message.get(AbstractHTTPDestination.HTTP_REQUEST);
        String sign= request.getHeader("sign");
        if("wangerxiao".equals(sign)){
            //request.setAttribute("info","robin");
            System.out.println("succes--------");
        }else {
            throw new Fault(new IllegalAccessException("sign错误"));
        }
    }
}
