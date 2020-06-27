package com.itheima.test;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

/**
 * 使用junit单元测试xml配置
 */
public class AccountServiceTest {
    @Test
    public void testFindAll() throws SQLException {
        // 1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2.得到业务层对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        // 3.执行方法
        List<Account> la = as.findAllAccount();
        for(Account a:la){
            System.out.println(a.toString());
        }

    }

    @Test
    public void testFindOne() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = applicationContext.getBean("accountService",IAccountService.class);
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave() throws SQLException {
        Account account = new Account();
        account.setMoney((float) 1234556123.0);
        account.setName("enisya");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = applicationContext.getBean("accountService",IAccountService.class);
        as.saveAccount(account);


    }

    @Test
    public void testUpdate() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = applicationContext.getBean("accountService",IAccountService.class);
        Account account1 = as.findAccountById(4);
        account1.setMoney(62345678910f);
        as.updateAccount(account1);
    }

    @Test
    public void testDelete() throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = applicationContext.getBean("accountService",IAccountService.class);
        as.deleteAccount(4);
    }


}
