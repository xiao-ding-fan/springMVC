package com.atguigu.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @author xiaowangtongxue
 * @date 2022/2/12 11:35
 */
@Controller
public class UserController {
    @GetMapping ("/user")
    public String getAllUser(){
        System.out.println("查询所有用户信息");
        return "success";
    }

    @GetMapping("user/{id}")
    public String getUserById(Integer id){
        System.out.println("查询一个用户的信息");
        return "success";
    }
    @PostMapping("/user")
    public String addUser(String username,String password){
        System.out.println("添加一个用户 "+username+":"+password);
        return "success";
    }
    @PutMapping("/user")
    public String modifyUser(){
        System.out.println("修改用户信息");
        return "success";
    }




}
