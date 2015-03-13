package client;

import com.yao.service.share.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by root on 15-3-13.
 */
public class HelloServiceTest {
    public  static void main(String[]args){
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(HelloService.class);
        factory.setAddress("http://localhost:9999/helloService?wsdl");
        HelloService service = (HelloService) factory.create();

        System.out.println("#############Client invoke say method ##############");
        String rel = service.say("yao");
        System.out.println(rel);
    }
}

