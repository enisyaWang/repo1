package com.bjpowernode.no01;






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
     * @Before：前置通知注解
     *  属性：value，切入点表达式，表示切面功能执行位置
     *  位置：在方法上面加
     * 特点：
     *  1.在目标方法之前先执行的
     *  2.不会改变目标方法的执行结果
     *  3.不会影响目标方法的执行
     */
    @Before(value = "execution(public void com.bjpowernode.SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(){
        // 就是你切面要执行的功能代码
        System.out.println("前置通知，切面功能：在目标方法之前输出执行时间："+new Date());
    }


}
