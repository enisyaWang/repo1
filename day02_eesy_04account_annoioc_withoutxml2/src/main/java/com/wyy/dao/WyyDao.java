package com.wyy.dao;

import com.wyy.entity.WyyEntity;

import java.sql.SQLException;
import java.util.List;

public interface WyyDao {
    List<WyyEntity> findAll() throws SQLException; // 接口中所有方法默认都是public，至于为什么要是public，原因在于如果不是public，那么只能在同个包下被实现

    WyyEntity findOneById(Integer id) throws SQLException;
}
