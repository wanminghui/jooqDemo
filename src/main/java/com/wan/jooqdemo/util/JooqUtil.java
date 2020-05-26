package com.wan.jooqdemo.util;


import com.wan.jooqdemo.Dao.jooq.tables.pojos.Student;
import org.jooq.*;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class JooqUtil {

    private  static String driver="com.mysql.cj.jdbc.Driver";
    private  static String username="wanminghui";
    private  static String password="HMW505991";
    private  static String url="jdbc:mysql://rm-bp1n51icgfyg5c75z9o.mysql.rds.aliyuncs.com:3306/userinfo";

    private static Connection connection=null;
    private static DSLContext dslContext=null;
    private static Result<Record> result=null;
    private static Table<Record> table=null;
     static {
         try{
             Class.forName(driver);
             connection= DriverManager.getConnection(url, username, password);
             dslContext= DSL.using(connection);
             table=DSL.table("student");

          }catch (Exception e){
            e.printStackTrace();
         }
     }


    public  List<Student>selectall(){
        System.out.println("进入到此方法中来");
        ArrayList<Student> list=null;
        result=dslContext.select().from(table).fetch();
        System.out.println("取到的结果是："+result);
        if(null!=result){
            list=new ArrayList<Student>();
            for(Record record :result ){
                Student temp=new Student();
                temp.setSid((int) record.getValue("sid"));
                temp.setSname((String)record.getValue("sname"));
                temp.setSage((int) record.getValue("sage"));
                list.add(temp);
            }
        }

    return  list;
    }

    //条件查询，通过用户传入的id去查询
    public List<Student>findByUserId(int userid){
         Condition condition=DSL.field("sage").eq(userid);//赋值对象条件
         SelectQuery<Record> selectQuery=dslContext.selectQuery(table);//获取查询对象
         selectQuery.addConditions(condition);//添加查询条件
         result=selectQuery.fetch();//进行查询
        ArrayList<Student> onelist=null;
        for(Record record : result ){
            Student tu=new Student();
            tu.setSage((int) record.getValue("sage"));
            tu.setSname((String) record.getValue("sname"));
            tu.setSid((int) record.getValue("sid"));
            onelist.add(tu);
        }

         // result=dslContext.select().from(table).fetch();
         System.out.println("根据id查询得到得到值是"+onelist);
         return  onelist;
    }






}
