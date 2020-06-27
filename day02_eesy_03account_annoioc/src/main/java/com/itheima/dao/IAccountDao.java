package com.itheima.dao;

import com.itheima.domain.Account;

import java.sql.SQLException;
import java.util.List;

/**
 * 账户的持久层接口
 */
public interface IAccountDao {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount() throws SQLException;

    /**
     * 查询一个
     */
    Account findAccountById(Integer accountId) throws SQLException;

    /**
     * 保存操作
     * @param account
     */

    void saveAccount(Account account) throws SQLException;

    /**
     * 更新数据
     * @param account
     */
    void updateAccount(Account account) throws SQLException;

    /**
     * 删除操作
     */
    void deleteAccount(Integer accountId) throws SQLException;

}
