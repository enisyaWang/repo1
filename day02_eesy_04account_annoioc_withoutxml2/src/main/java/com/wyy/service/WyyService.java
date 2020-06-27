package com.wyy.service;

import com.wyy.entity.WyyEntity;

import java.sql.SQLException;
import java.util.List;

public interface WyyService {
    // 而在java中一个类如果没有权限的修饰符，默认是friendly/default (同一个包内的其它类才可访问)
    List<WyyEntity> findAll() throws SQLException; // 接口中所有方法默认都是public，至于为什么要是public，原因在于如果不是public，那么只能在同个包下被实现

    WyyEntity findOneById(Integer id) throws SQLException;


}
