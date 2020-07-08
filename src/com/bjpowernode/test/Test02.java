package com.bjpowernode.test;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.Impl.StudentServiceImpl;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.util.ServiceFactory;
import com.bjpowernode.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        StudentDao studentDao=SqlSessionUtil.getSession().getMapper(StudentDao.class);

        /*Student s=studentDao.select1("A0001");
        System.out.println(s);*/

        /*List<Student> slist=studentDao.select2("wyf");
        for(Student s: slist){
            System.out.println(s);
        }*/

        /*Student s=new Student();
        s.setName("lh");
        s.setAge(24);
        List<Student> slist=studentDao.select3(s);
        for(Student s1:slist){
            System.out.println(s1);
        }*/

        /*List<Map<String,Object>> mylist=studentDao.select5();
        for(Map<String,Object> map:mylist){
            Set<String> setlist=map.keySet();
            for(String s: setlist){
                System.out.print("key "+s+" ");
                System.out.println("value "+map.get(s));
            }
            System.out.println("=======================");
        }*/


        /*Map<String,Object> map=new HashMap<String,Object>();
        map.put("name","wyf");
        map.put("age",23);

        Student s=studentDao.select6(map);
        System.out.println(s);*/

        List<Student> slist=studentDao.select8();
        for(Student s : slist){
            System.out.println(s);


        }
    }
}
