package client;

import com.yao.service.share.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 15-3-17.
 */
public class ClientTest {
    public static void main(String[]args){
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath*:/spring/spring-cxf-client.xml");
        HelloService helloService=(HelloService)context.getBean("helloService");
        System.out.println(helloService.say("xxx"));
    }
}
