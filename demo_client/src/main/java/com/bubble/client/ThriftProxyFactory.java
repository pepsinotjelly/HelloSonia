package com.bubble.client;

/**
 * @Author: sunpengyu.sonia
 * @Date: 2022/1/21 11:59 AM
 * @Desc:
 */
public class ThriftProxyFactory {

    public static Object newInstance(Class classT, String[] hostPorts) {
        ThriftProxy thriftProxy = new ThriftProxy();
        return thriftProxy.newInstance(classT, hostPorts);
    }


}
