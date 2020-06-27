package test;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import config.SpringConfigration;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

/**
 * 使用junit单元测试xml配置
 * spring整合junit
 */
public class AccountServiceTest {
//    private ApplicationContext ac;
//    private IAccountService as;
//
//    @Before
//    public void init(){
//        // 1.获取容器
//        ac = new AnnotationConfigApplicationContext(SpringConfigration.class);
//        // 2.得到业务层对象
//        as = (IAccountService) ac.getBean("accountService");
//
//    }

    @Test
    public void testFindAll() throws SQLException {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfigration.class);
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        // 3.执行方法
        List<Account> la = as.findAllAccount();
        for(Account a:la){
            System.out.println(a.toString());
        }

    }

    @Test
    public void testFindOne() throws Exception {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfigration.class);
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave() throws SQLException {
        Account account = new Account();
        account.setMoney((float) 1234556123.0);
        account.setName("enisya");
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfigration.class);
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        as.saveAccount(account);


    }

    @Test
    public void testUpdate() throws Exception {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfigration.class);
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        Account account1 = as.findAccountById(4);
        account1.setMoney(62345678910f);
        as.updateAccount(account1);
    }

    @Test
    public void testDelete() throws SQLException {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfigration.class);
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        as.deleteAccount(4);
    }


}
