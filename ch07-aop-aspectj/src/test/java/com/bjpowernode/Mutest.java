package com.bjpowernode;


import com.bjpowernode.dao.StudentDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mutest {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext acx = new ClassPathXmlApplicationContext(config);
        StudentDao studentDao = (StudentDao) acx.getBean("studentDao");
        studentDao.createTable();
    }




}
