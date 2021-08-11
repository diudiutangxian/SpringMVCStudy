package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxController {

    @RequestMapping("/test1")
    public String test(){
        return "test";
    }
    @RequestMapping("/testjquery")
    @ResponseBody
    public void testJquery(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>"+name);
        if ("freya".equalsIgnoreCase(name)){
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }
    }
    @RequestMapping("/a2")
    @ResponseBody
    public List<User> a2(){
        List<User> list = new ArrayList<>();
        list.add(new User("aa",18,"f"));
        list.add(new User("bb",18,"m"));
        list.add(new User("cc",18,"m"));
        return list;
    }
    @RequestMapping("/a3")
    @ResponseBody
    public String a3(String name, String pwd){
        String msg = "";
        if (name != null){
            if ("admin".equals(name)){
                msg = "ok";
            }else {
                msg = "用户名有误";
            }
        }
        if (pwd != null){
            if ("123".equals(pwd)){
                msg = "ok";
            }else {
                msg = "密码有误有误";
            }
        }
        return msg;
    }
}
