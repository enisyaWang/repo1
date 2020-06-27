package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * 账户的业务层实现类
 *     曾经xml的配置：
 *      <bean id="accountService" class="com.itheima.service.impl.AccountServiceImpl"></bean>
 *
 */
@Controller("accountService")
@Scope(value = "singleton")
public class AccountServiceImpl implements IAccountService {

/*
    @Autowired
    private IAccountDao accountDao1;
    public void  saveAccount(){
        accountDao1.saveAccount();
    }*/
/*
    @Autowired
    @Qualifier(value = "accountDao2")*/
    @Resource(name = "accountDao2")
    private IAccountDao accountDao = null;
    public void saveAccount(){
        accountDao.saveAccount();
    }

    @PostConstruct
    public void init(){
        System.out.println("init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy...");
    }

}
