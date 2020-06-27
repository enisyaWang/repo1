package com.bjpowernode;

import com.bjpowernode.ao03.SomeService;
import com.bjpowernode.ao02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mutest {
    @Test
    public void test01(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService proxy = (SomeService) ctx.getBean("sService");
        proxy.doSome("wyy",23);
        proxy.doOther("wyy",23);
        // proxy:com.sun.proxy.$Proxy10         jdk动态代理
        System.out.println("proxy:"+proxy.getClass().getName());
    }



    @Test
    public void test03(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService proxy = (SomeService) ctx.getBean("sService2");
        String ssd = proxy.doFirst("wyy",23);
        System.out.println(ssd);
    }
}
