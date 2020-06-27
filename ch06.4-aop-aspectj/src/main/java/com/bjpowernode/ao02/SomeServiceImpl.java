package com.bjpowernode.ao02;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        // 给doSome方法增加一个功能，在doSome执行之前，输出方法执行时间
        System.out.println("======目标方法doSome======");
    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("======目标方法doOther======");
        return "abcd";
    }

    @Override
    public Student doOther2(String name, Integer age) {
        System.out.println("======目标方法doOther2======");
        Student student = new Student();
        student.setAge(12);
        student.setName("Jane");
        return student;
    }


}
