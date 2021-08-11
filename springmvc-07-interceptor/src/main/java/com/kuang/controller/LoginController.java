package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }
    @RequestMapping("/gologin")
    public String gologin(){
        return "login";
    }
    @RequestMapping("/login")
    public String login(String name, String pwd, HttpSession session, Model model){
        session.setAttribute("userInfo", name);
        model.addAttribute("username", name);
        return "main";
    }
    @RequestMapping("/logout")
    public String logout(String name, String pwd, HttpSession session, Model model){
        session.removeAttribute("userInfo");
        return "main";
    }

}
