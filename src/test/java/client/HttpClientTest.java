package client;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.IOException;

/**
 * Created by root on 15-3-20.
 */
public class HttpClientTest {
    public static void main(String[]args) throws IOException {
        HttpClient client=new HttpClient();
        PostMethod postMethod=new PostMethod("http://localhost:9988/rest/helloService/say");
        postMethod.addParameter("name","wangerxiao hhha");
        postMethod.setRequestHeader("sign","wangerxiao");
        int code=client.executeMethod(postMethod);
        String res=postMethod.getResponseBodyAsString();
        System.out.println(code+"  :"+res);
    }
}
