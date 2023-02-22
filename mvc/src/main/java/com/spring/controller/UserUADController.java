package com.spring.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * {@code @Description:}
 */
@Controller
@RequestMapping("/uad")
public class UserUADController {
    /*
     * 单文件上传
     * */
    @RequestMapping("/uploadS")
    // 上传的文件被封装到MultipartFile接口类型的参数multipartFile中，注意上传表单项的名称要和形参名称对应
    public void uploadS(@RequestParam("upload") MultipartFile multipartFile) throws IOException {
        // 获取文件原始名称
        String originalFilename = multipartFile.getOriginalFilename();
        // 将文件保存到磁盘下
        multipartFile.transferTo(new File("E:\\" + originalFilename));
        System.out.println("上传成功");
    }
    
    
    /*
     * 多文件上传
     * */
    @RequestMapping("/uploadM")
    // 上传的文件集合被封装到List<MultipartFile>集合类型的参数multipartFile中，注意上传表单项的名称要和形参名称对应
    public void uploadM(@RequestParam("upload") List<MultipartFile> multipartFile) throws IOException {
        System.out.println(multipartFile);
        for (MultipartFile file : multipartFile) {
            // 获取文件原始名称
            String originalFilename = file.getOriginalFilename();
            // 将文件保存到磁盘下
            file.transferTo(new File("E:\\" + originalFilename));
            System.out.println("上传成功");
        }
    }
    
    
    /*
     * 文件下载
     * */
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request, @RequestParam("filename") String downloadFilename) throws IOException {
        
        // 指定要下载的文件指定路径
        String path = request.getServletContext().getRealPath("/file");
        System.out.println(path);// D:\-\IDEA\IntelliJ IDEA 2021.3.2\Workspace\Spring\MVC\target\MVC-1.0-SNAPSHOT\file
        // 创建该文件对象
        File file = new File(path + File.separator + downloadFilename);// File.separator是分隔符，即正斜线或反斜线
        System.out.println(file);// D:\-\IDEA\IntelliJ IDEA 2021.3.2\Workspace\Spring\MVC\target\MVC-1.0-SNAPSHOT\file\斯科菲尔德.jpg
        
        // 设置响应头
        HttpHeaders headers = new HttpHeaders();
        // 设置下载的文件类型，即MIME类型
        headers.setContentType(MediaType.IMAGE_JPEG);
        // 通知浏览器以附件，即下载的方式打开文件，并将文件名编码转换为utf-8
        headers.setContentDispositionFormData("attachment", URLEncoder.encode(downloadFilename, "UTF-8"));
        
        // 使用SpringMVC框架的ResponseEntity对象封装下载信息给浏览器（响应体、响应头、响应状态码）
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(FileUtils.readFileToByteArray(file), headers, HttpStatus.OK);
        
        return responseEntity;
    }
    
    
}