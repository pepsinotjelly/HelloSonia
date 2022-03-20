package com.bubble.constants.annotations;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @Author: sunpengyu.sonia
 * @Date: 2022/1/21 2:32 PM
 * @Desc:
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface ThriftService {
    String serviceImplName() default "";
    int PORT() default 7000;
}
