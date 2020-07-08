package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    public Student getById(String id);

    public void save(Student s);

    List<Student> getAll();

    Student select1(String a0001);

    List<Student> select2(String wyf);

    List<Student> select3(Student s);

    List<Student> select4(Map<String,Object> map);

    List<Map<String, Object>> select5();

    Student select6(Map<String, Object> map);

    List<Student> select7();

    List<Student> select8();
}
