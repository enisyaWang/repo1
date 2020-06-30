package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.service.StudentService;

public class StudentServiceImpl implements StudentService {


    private StudentDao studentDao;
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    @Override
    public void createTable() {
        studentDao.createTable();

    }
}
