package com.bjpowernode.service.Impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.util.SqlSessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao dao= SqlSessionUtil.getSession().getMapper(StudentDao.class);

    @Override
    public Student getById(String id) {
        Student s=dao.getById(id);
        return s;
    }

    @Override
    public void save(Student s) {
        dao.save(s);
    }

    @Override
    public List<Student> getAll() {
        List<Student> slist=dao.getAll();
        return slist;
    }
}
