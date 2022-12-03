package com.spring.controller;

import com.spring.pojo.User;
import com.spring.pojo.VO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @description:
 */
@Controller
@RequestMapping("/bind")
public class UserDataBindController {
    
    /*
     * http://localhost:8080/bind/saySimp?username=zs&age=20
     * http://localhost:8080/bind/saySimp?age=20&username=zs
     * 业务方法中的参数名称要与请求参数的key一致，即使顺序不一致，参数值也会自动映射匹配
     * */
    @RequestMapping("/saySimp")
    @ResponseBody// 不跳转视图，而是返回字符串或对象
    public void saySimp(String username, int age) {
        System.out.println(username);// zs
        System.out.println(age);// 20
    }
    
    
    /*
     * http://localhost:8080/bind/sayPojo?username=zs&age=20
     * http://localhost:8080/bind/sayPojo?age=20&username=zs
     * 业务方法中的POJO类型的参数的属性名与请求参数的key一致，即使顺序不一致，参数值也会自动映射匹配
     * */
    @RequestMapping("/sayPojo")
    @ResponseBody// 不跳转视图，而是返回字符串或对象
    public void sayPojo(User user) {
        System.out.println(user);// User{username='zs', age=20}
    }
    
    
    /*
     * http://localhost:8080/bind/sayArray?strs=a&strs='b'&strs="c"
     * http://localhost:8080/bind/sayArray?strs=a,'b',"c"
     * 业务方法中的数组名称与请求参数的key一致，参数值会自动映射匹配。
     * */
    @RequestMapping("/sayArray")
    @ResponseBody// 不跳转视图，而是返回字符串或对象
    public void sayArray(String[] strs) {
        System.out.println(Arrays.asList(strs));// [a, 'b', "c"]
    }
    
    
    /*
     * http://localhost:8080/bind/sayVo?userList%5B0%5D.username=zs&userList%5B0%5D.age=20&userList%5B1%5D.username=kobe&userList%5B1%5D.age=24
     * 表单get方法提交后的地址栏，如果想要直接在地址栏访问得这样写
     *
     * http://localhost:8080/bind/sayVo?userList[0].username=zs&userList[0].age=20&userList[1].username=kobe&userList[1].age=24
     * 如果这样直接在地址栏访问，不可以，因为浏览器会编码符号
     *
     * 获得集合参数时，业务方法不支持直接使用集合形参进行数据绑定，要将集合参数包装到一个POJO中才可以
     * */
    @RequestMapping("/sayVo")
    @ResponseBody// 不跳转视图，而是返回字符串或对象
    public void sayVo(VO vo) {
        System.out.println(vo);// VO{userList=[User{username='zs', age=20}, User{username='kobe', age=24}]}
    }
    
    
    /*
     * 利用AJAX接收集合参数
     * */
    @RequestMapping("/sayAjax")
    // @RequestBody用于接收前端传递给后端的JSON字符串中的数据(请求体中的数据)
    public void sayAjax(@RequestBody List<User> userList) {
        System.out.println(userList);// [User{username='zs', age=20}, User{username='kobe', age=24}]
    }
    
    
    /*
     * http://localhost:8080/bind/sayRP?name=zs
     * 通过@RequestParam接收请求参数
     * */
    @RequestMapping("/sayRP")
    @ResponseBody// 不跳转视图，而是返回字符串或对象
    // 当请求的参数名称与业务方法参数名称不一致时，使用@RequestParam用于进行将两者对应绑定
    public void sayRP(@RequestParam("name") String username) {
        System.out.println(username);// zs
    }
    
    
    /*
     * http://localhost:8080/bind/sayDate?date=2000/01/01   Sat Jan 01 00:00:00 CST 2000
     * http://localhost:8080/bind/sayDate?date=2000-01-01   400
     *
     * 配置日期转换器后
     * http://localhost:8080/bind/sayDate?date=2000-01-01   Sat Jan 01 00:00:00 CST 2000
     *
     * 使用自定义转换器转换获取的日期字符串的格式
     * */
    @RequestMapping("/sayDate")
    @ResponseBody// 不跳转视图，而是返回字符串或对象
    public void sayDate(Date date) {
        System.out.println(date);
    }
    
    
    /*
     * 获取请求头参数
     * */
    
    @RequestMapping("/sayRH")
    @ResponseBody// 不跳转视图，而是返回字符串或对象
    public void sayRH(@RequestHeader("User-Agent") String headerValue) {
        System.out.println(headerValue);// Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:100.0) Gecko/20100101 Firefox/100.0
    }
    
    @RequestMapping("/sayCookie")
    @ResponseBody// 不跳转视图，而是返回字符串或对象
    public void sayCookie(@CookieValue("JSESSIONID") String cookieValue) {
        System.out.println(cookieValue);// 0F24761A943766839CE75166C849B3DF
    }
    
    
}