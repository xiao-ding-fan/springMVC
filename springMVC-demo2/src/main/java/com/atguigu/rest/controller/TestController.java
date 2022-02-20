package com.atguigu.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaowangtongxue
 * @date 2022/2/10 21:21
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
