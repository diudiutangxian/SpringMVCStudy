package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RestfulController {

    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable String b, Model model){
        String res = a + b;
        model.addAttribute("msg", "结果：" + res);
        return "test";
    }
    @RequestMapping(name = "/add/{a}/{b}", method = RequestMethod.POST)
    public String addPost(@PathVariable int a, @PathVariable String b, Model model){
        String res = a + b;
        model.addAttribute("msg", "post结果：" + res);
        return "test";
    }
}
