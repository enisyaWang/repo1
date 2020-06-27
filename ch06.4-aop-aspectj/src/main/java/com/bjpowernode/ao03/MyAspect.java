package com.bjpowernode.ao03;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @Aspect：是aspectj框架中的注解
 * 作用：表示当前类是切面类
 * 切面类：用来给业务方法增加功能的类，在这个类中有切面功能代码
 * 位置：在类定义上面
 *
 */
@Aspect
public class MyAspect {
    /**
     * 定义方法，方法是实现切面功能的
     * 定义要求：
     * 1.公共方法
     * 2.没有返回值
     * 3.方法名称自定义
     * 4.方法可以有参数
     *      如果有参数，参数不是自定义的，有几个参数类型可以使用
     *
     */

    /**
     * @Around:环绕通知
     *  属性：value，切入点表达式，表示切面功能执行位置
     *  位置：在方法上面加
     * 特点：
     *  1.在目标方法的前和后都增加功能
     *  2.控制目标方法是否被调用执行
     *  3.修改原来的目标方法执行结果。影响最后的调用结果
     *
     *  环绕通知，等同于jdk动态代理，
     */
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (Object arg:args
             ) {
            System.out.println(arg);
        }
        //实现环绕通知
        Object result = null;
        System.out.println("环绕通知：在目标方法之前，输出时间："+new Date());
        //1.目标方法调用
        result = pjp.proceed(); // Object result = doFirst();
        System.out.println("环绕通知：在目标方法之后，提交事务");
        // 2.在目标方法的前或者后加入功能
        if (result != null){
            result = "hello"+result;
        }
        // 返回目标方法的执行结果
        return result;
    }







}
