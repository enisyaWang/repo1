package com.bjpowernode.no01;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer id) {
        // 给dosome方法增加一个功能，在dosome执行之前，输出执行时间
        System.out.println("======目标方法，dosome======");
    }
}
