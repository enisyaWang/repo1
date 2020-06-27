package com.itheima.ui;

import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {

    public static void main(String[] args) {
        //IAccountService as = new AccountServiceImpl();

        // 获取核心容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        // 根据id获取bean对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
//        IAccountService as2 = (IAccountService) ac.getBean("accountService");
//        System.out.println(as==as2);
//        ac.close();
//        System.out.println(as);
//
//        IAccountDao adao = (IAccountDao) ac.getBean("accountDao");
//        System.out.println(adao);
        as.saveAccount();

    }
}
