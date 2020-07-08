package com.bjpowernode.test;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.Impl.StudentServiceImpl;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.util.ServiceFactory;
import com.bjpowernode.util.TransactionInvocationHandler;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        StudentService ss= (StudentService) ServiceFactory.getService(new StudentServiceImpl());
       //测试添加操作
        /*Student s = new Student();
        s.setId("A0006");
        s.setName("zhangsan");
        s.setAge(30);
        ss.save(s);*/

        //测试查询操作
        /*Student s=ss.getById("A0003");
        System.out.println(s);
*/
        List<Student> slist=ss.getAll();
        for(Student s:slist){
            System.out.println(s);
        }

    }
}
