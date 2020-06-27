package com.bjpowernode;

import com.bjpowernode.no01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void test01(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService proxy = (SomeService) ctx.getBean("sService");
        proxy.doSome("wyy",23);

    }
}
