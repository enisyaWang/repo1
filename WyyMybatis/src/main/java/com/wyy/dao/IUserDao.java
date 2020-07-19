package com.wyy.dao;

import com.wyy.entity.User;

import java.util.List;

public interface IUserDao {
    List<User> selectAll();
}
