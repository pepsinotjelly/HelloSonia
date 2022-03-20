package com.bubble.thrift;

import com.bubble.biz.SayHelloBiz;
import com.bubble.constants.annotations.ThriftService;
import org.apache.thrift.TException;
import com.bubble.thrift.BaseResp;
import com.bubble.thrift.test.HelloRequest;
import com.bubble.thrift.test.HelloResponse;
import com.bubble.thrift.test.SayHelloService;
import org.apache.thrift.TException;

/**
 * @Author: sunpengyu.sonia
 * @Date: 2022/1/21 11:42 AM
 * @Desc:
 */
@ThriftService(serviceImplName = "SayHelloServiceImpl.class",PORT = 7090)
public class SayHelloServiceImpl implements SayHelloService.Iface {
    SayHelloBiz sayHelloBiz = new SayHelloBiz();

    @Override
    public HelloResponse Visit(HelloRequest helloRequest) throws TException {
        System.out.println("==================catch client===============");
        return sayHelloBiz.Visit(helloRequest);
    }
}
