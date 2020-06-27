package com.bjpowernode.ao02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    /*
    后置通知：
     */
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",
                    returning = "res1")
    public void myAfterReturning(Object res1){
        // Object res:是目标方法执行后的返回值，根据返回值做你的切面功能处理
        if (res1!=null){
            res1 = "Hello Aspectj";
        }
        System.out.println("后置通知：在目标方法之后执行的，获取的返回值是："+res1);

    }

    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther2(..))",
            returning = "res1")
    public void myAfterReturning2(JoinPoint jp, Student res1){
        System.out.println("后置通知：方法的定义"+jp.getSignature());
        // Object res:是目标方法执行后的返回值，根据返回值做你的切面功能处理
        if (res1!=null){
            System.out.println(res1);
            res1.setName("LYF");
        }
        System.out.println("后置通知：在目标方法之后执行的，获取的返回值是："+res1);

    }

}
