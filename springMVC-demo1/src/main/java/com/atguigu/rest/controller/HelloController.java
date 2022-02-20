package com.atguigu.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaowangtongxue
 * @date 2022/2/10 20:41
 */
@Controller
public class HelloController {

    @RequestMapping(value = {"/","login"})
    public String index(){
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }

}
