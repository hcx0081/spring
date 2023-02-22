package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * {@code @Description:}
 */
@Controller
public class TargetController {
    
    @RequestMapping("/target")
    public String show(Model model) {
        System.out.println("目标资源执行");
        model.addAttribute("name", "zs");
        return "index";
    }
}