package com.xh.spring5.testdemo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xuhao
 * @date 2022/6/9-21:41
 */
public class TestSpring {

    @Test
    public void testadd(){
        ApplicationContext context
                = new AnnotationConfigApplicationContext(SpringConfig.class);
    }
}
