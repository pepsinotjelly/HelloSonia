package com.bubble;

import com.bubble.client.ThriftClient;
import org.apache.thrift.TException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ClientApplication
{
    public static void main( String[] args ) throws TException {
        System.out.println( "Hello World!" );
        SpringApplication.run(ClientApplication.class);
        ThriftClient client = new ThriftClient();
        client.startClient();
    }
}
