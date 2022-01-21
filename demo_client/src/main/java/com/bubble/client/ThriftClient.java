package com.bubble.client;

import com.bubble.thrift.test.HelloRequest;
import com.bubble.thrift.test.HelloResponse;
import com.bubble.thrift.test.SayHelloService;
import org.apache.thrift.TException;

/**
 * @Author: sunpengyu.sonia
 * @Date: 2022/1/21 12:00 PM
 * @Desc:
 */
public class ThriftClient {
    public static void startClient() throws TException {
        String[] hostPorts = new String[]{"localhost:7090"};
        SayHelloService.Iface client = (SayHelloService.Iface) ThriftProxyFactory.newInstance(SayHelloService.class, hostPorts);
        HelloRequest helloRequest = new HelloRequest();
        helloRequest.setSayWhat("who am i");
        helloRequest.setTimes(3);
        HelloResponse helloResponse = client.Visit(helloRequest);
        System.out.println(helloResponse.answerIs);

//        SayHelloService.Iface hello = (SayHelloService.Iface) ThriftProxyFactory.newInstance(SayHelloService.class, hostPorts);

    }
}
