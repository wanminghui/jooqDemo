package com.wan.jooqdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @GetMapping("user/info")
    public String usershow(Model model){
        System.out.println("we are coming *******");
        Map<String,String>user= new HashMap<>();
        user.put("age","12");
        user.put("username", "张小花");
       // model.addAttribute("name",  user);
        model.addAttribute("yourname", user);
        model.addAttribute("fucker", "张三");
        return "index";
    }

}
