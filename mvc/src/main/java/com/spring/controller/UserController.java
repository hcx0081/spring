package com.spring.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

/**
 * @description:控制层
 */

@Controller
@RequestMapping("/user")
public class UserController {
    
    //请求地址  http://localhost:8080/user/say
    @RequestMapping(value = "/say")
    public String say() {
        return "success";
    }
    
    
    /*
     * ModelAndView
     * */
    
    @RequestMapping(value = "/sayMV")
    public ModelAndView sayMV() {
        /*
         * 模型 Model：封装数据
         * 视图 View：展示数据
         * */
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据,在model中存放数据，相当于request域；在前端可以用EL表达式取出
        modelAndView.addObject("username", "hcx");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }
    
    @RequestMapping(value = "/sayMV2")
    //ModelAndView modelAndView 直接写在形参是因为Spring框架自动注入的，是它提供的，初始化创建好的
    public ModelAndView sayMV2(ModelAndView modelAndView) {
        /*
         * 模型 Model：封装数据
         * 视图 View：展示数据
         * */
        //设置模型数据,在model中存放数据，相当于request域；在前端可以用EL表达式取出
        modelAndView.addObject("username", "hcx");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }
    
    
    /*
     * String
     * */
    
    //与下面的类似，但是不推荐使用
    @RequestMapping(value = "/sayStr")
    //Tomcat服务器原生产生，框架负责传递
    public String sayStr(HttpServletRequest request) {
        request.setAttribute("username", "hcx");
        return "success";
    }
    
    @RequestMapping(value = "/sayStrM")
    //Model model 直接写在形参是因为Spring框架自动注入的，是它提供的，初始化创建好的
    public String sayStrM(Model model) {
        /*
         * 模型 Model：封装数据
         * */
        //设置模型数据,在model中存放数据，相当于在request域中存放数据；在前端可以用EL表达式取出
        model.addAttribute("username", "hcx");
        return "success";
    }
    
    @RequestMapping(value = "/sayMap")
    public String sayMap(Map<String, Object> map) {
        //在map中存放数据，相当于在request域中存放数据；在前端可以用EL表达式取出
        map.put("username", "hcx");
        return "success";
    }
    
    @RequestMapping(value = "/sayMM")
    public String sayMM(ModelMap modelMap) {
        //在modelMap中存放数据，相当于在request域中存放数据；在前端可以用EL表达式取出
        /*两种方法都可以*/
        modelMap.put("username", "hcx");
        //modelMap.addAttribute("username", "hcx");
        return "success";
    }
    
    
    @RequestMapping(value = "/sayS")
    public String sayS(HttpSession session) {
        session.setAttribute("username", "hcx");
        return "success";
    }
    
    @RequestMapping(value = "/sayApp")
    public String sayApp(/*HttpSession session*/HttpServletRequest request) {
        //ServletContext servletContext = session.getServletContext();
        ServletContext servletContext = request.getServletContext();
        servletContext.setAttribute("username", "hcx");
        return "success";
    }
    
    
    /*
     * 无返回值 void
     * */
    
    @RequestMapping(value = "/sayP")
    public void sayP(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");//不加会出现?乱码
        response.getWriter().print("直接返回字符串");
    }
    
    
    /*
     * 自定义类型对象
     * */
    
    @RequestMapping(value = "/sayRB")
    @ResponseBody//不加该注解会返回一个视图，但是找不到该视图，所以需要加上该注解可以告知SpringMVC框架不进行视图跳转，而是将需要回写的字符串或对象直接返回
    public String sayRB() {
        return "String";
    }
    
    
    @RequestMapping(value = "/sayJson")
    @ResponseBody//将需要回写的字符串或对象直接返回
    public String sayJson() throws JsonProcessingException {
        User user = new User();
        user.setUsername("hcx");
        user.setAge(20);
        
        //使用json转换工具将json对象转换为json字符串格式返回
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        
        return json;
    }
    
    
    @RequestMapping(value = "/sayJsonAuto")
    @ResponseBody//将需要回写的字符串或对象直接返回
    public User sayJsonAuto() {
        User user = new User();
        user.setUsername("hcx");
        user.setAge(20);
        return user;//SpringMVC将user自动转换为json格式字符串，是因为配置文件中配置了处理器适配器
    }
    
    
    @RequestMapping(value = "/sayDriven")
    @ResponseBody//将需要回写的字符串或对象直接返回
    public User sayDriven() {
        User user = new User();
        user.setUsername("hcx");
        user.setAge(20);
        return user;//SpringMVC将user自动转换为json格式字符串，是因为配置文件中配置了注解驱动
    }
    
}
