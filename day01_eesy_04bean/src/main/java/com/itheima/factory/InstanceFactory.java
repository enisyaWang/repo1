package com.itheima.factory;

import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;

/*
    模拟一个工厂类，该类可能存在云jar包当中，我们无法通过修改源码的方式来提供默认构造函数。
 */
public class InstanceFactory {
    // 该类提供一个方法，返回IAccountService接口类型的返回值，即它的实现类AccountServiceImpl
    public IAccountService getAccountService(){
        return new AccountServiceImpl();
    }

}
