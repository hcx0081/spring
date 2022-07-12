package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @description:
 */
@Controller
public class MainController {
    
    //登录
    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        HttpSession session=request.getSession();
        session.setAttribute("name","ls");
        System.out.println("登录成功");
        return "main";
    }
    
    //退出登录
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        System.out.println("退出登录成功");
        return "main";
    }
    
    //访问
    @RequestMapping("/toindex")
    public String toindex(){
        System.out.println("访问成功");
        return "index";
    }


}
