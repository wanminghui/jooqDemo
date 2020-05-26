package com.wan.jooqdemo.Controller;

import com.wan.jooqdemo.Dao.jooq.tables.pojos.Student;
import com.wan.jooqdemo.util.JooqUtil;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.StreamSupport;

public class MainTest {

//    public static void main(String[] args) {
//        String username="root";
//        String password="HMW505991";
//        String url="jdbc:mysql://rm-bp1n51icgfyg5c75z9o.mysql.rds.aliyuncs.com:3306/userinfo";
//        Connection connection;
//        try {
//            //设置mysql链接
//            connection= DriverManager.getConnection(url, username, password);
//            //传入一个简单的connection对象  数据库方言得到一个DSLContext 的实例，然后用 DSL对象查询得到一个Result对象
//            DSLContext using = DSL.using(connection, SQLDialect.MYSQL);
////            Result<Record> recordResult= using.select().from(Student).fetch();
////            recordResult.forEach(record -> {
////                Integer sid=record
////            });
//
//
//        }catch (Exception e){
//
//        }
//
//    }


public static void main(String[] args) {
   //JooqUtil jooqUtil=new JooqUtil();
    ///System.out.println("查询出来的数据是："+jooqUtil.selectall());
    //List<Student> students= jooqUtil.findByUserId(22);
   // System.out.println("条件查询的结果是"+students);
}


}
