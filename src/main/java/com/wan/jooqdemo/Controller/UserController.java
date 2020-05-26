package com.wan.jooqdemo.Controller;

import com.wan.jooqdemo.Dao.jooq.tables.pojos.Student;
import com.wan.jooqdemo.util.JooqUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
   JooqUtil jooqUtil=new JooqUtil();

    @GetMapping("user/info")
    public String usershow(Model model){
        System.out.println("we are coming *******");
//        Map<String,String>user= new HashMap<>();
//        user.put("age","12");
//        user.put("username", "张小花");
       List<Student> jack = jooqUtil.selectall();

       // model.addAttribute("name",  user);
        model.addAttribute("yourname", jack);
        return "index";
    }

}
