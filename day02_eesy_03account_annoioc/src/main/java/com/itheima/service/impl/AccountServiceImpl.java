package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * 账户的业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;


    public List<Account> findAllAccount() throws SQLException {
        return accountDao.findAllAccount();
    }

    public Account findAccountById(Integer accountId) throws Exception{
        return accountDao.findAccountById(accountId);
    }

    public void saveAccount(Account account) throws SQLException {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) throws SQLException {
        accountDao.updateAccount(account);
    }

    public void deleteAccount(Integer accountId) throws SQLException {
        accountDao.deleteAccount(accountId);
    }
}
