package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
public class EncodingController {

    @RequestMapping("/e/t")
    public String testEncoding(String name, Model model){
        System.out.println(name);
        model.addAttribute("msg", name);
        return "test";
    }
}
