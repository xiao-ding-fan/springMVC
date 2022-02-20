package com.atguigu.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaowangtongxue
 * @date 2022/2/11 21:38
 */
@Controller
public class TestController {
//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:http://www.baidu.com";
    }

}
