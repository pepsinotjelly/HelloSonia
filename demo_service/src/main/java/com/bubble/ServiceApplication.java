package com.bubble;

import com.bubble.service.ThriftService;
import com.bubble.thrift.SayHelloServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@Slf4j
@SpringBootApplication
public class ServiceApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServiceApplication.class);
        ThriftService.start(SayHelloServiceImpl.class,7090);
    }
}
