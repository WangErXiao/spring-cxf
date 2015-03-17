package com.yao.service.client;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.io.CacheAndWriteOutputStream;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.transport.http.AbstractHTTPDestination;

import javax.servlet.http.HttpServletRequest;
import java.io.OutputStream;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by root on 15-3-17.
 */
public class AuthorizationOutInterceptor extends AbstractPhaseInterceptor<Message> {
    public AuthorizationOutInterceptor() {
        super(Phase.PRE_STREAM);
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        System.out.println("out------------------->>>>");
        message.setContextualProperty("sign","wangerxiao");
    }
}
