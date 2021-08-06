package com.kuang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kuang.pojo.User;
import com.kuang.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("/j1")
    public String json1() throws JsonProcessingException {
        User user = new User("哈哈", 1, "f");
        ObjectMapper mapper = new ObjectMapper();
        String res = mapper.writeValueAsString(user);
        return res;
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {

       //创建一个jackson的对象映射器，用来解析数据
       ObjectMapper mapper = new ObjectMapper();
       //创建一个对象
       User user1 = new User("秦疆1号", 3, "男");
       User user2 = new User("秦疆2号", 3, "男");
       User user3 = new User("秦疆3号", 3, "男");
       User user4 = new User("秦疆4号", 3, "男");
       List<User> list = new ArrayList<User>();
       list.add(user1);
       list.add(user2);
       list.add(user3);
       list.add(user4);
       //将我们的对象解析成为json格式
       String str = mapper.writeValueAsString(list);
       return str;
    }
    @RequestMapping("/j3")
    public String json3(){
        Date date = new Date();
        return JsonUtils.getJson(date);
    }
}
