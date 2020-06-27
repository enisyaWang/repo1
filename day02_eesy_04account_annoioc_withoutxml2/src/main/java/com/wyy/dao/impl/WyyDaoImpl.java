package com.wyy.dao.impl;

import com.wyy.dao.WyyDao;
import com.wyy.entity.WyyEntity;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
@Repository("wyyDao")
public class WyyDaoImpl implements WyyDao {

    @Autowired
    private QueryRunner runner;

    public List<WyyEntity> findAll() throws SQLException {
        // BeanListHandler：将结果集中的每一行数据都封装到一个对应的JavaBean实例中，存放到List里
        return runner.query("select * from account",new BeanListHandler<WyyEntity>(WyyEntity.class));
    }

    public WyyEntity findOneById(Integer id) throws SQLException {
        return runner.query("select * from account where id=?",new BeanHandler<WyyEntity>(WyyEntity.class),id);
    }
}
