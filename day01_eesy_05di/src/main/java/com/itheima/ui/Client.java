package com.itheima.ui;

import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
import com.itheima.service.impl.AccountServiceImpl3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    public static void main(String[] args) {
        // 获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 根据id获取bean对象（其实就是类实例）
        IAccountService as = (IAccountService) ac.getBean("accountService");
        as.saveAccount();
//        IAccountService as = (IAccountService) ac.getBean("accountService2");
//        as.saveAccount();

//        IAccountService as = (IAccountService) ac.getBean("accountService3");
//        as.saveAccount();



    }
}
