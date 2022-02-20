package com.atguigu.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author xiaowangtongxue
 * @date 2022/2/11 21:47
 */
@Controller
public class ScopeController {
    @RequestMapping("/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest httpServletRequest) {
        httpServletRequest.setAttribute("testRequestScope", "hello,Servlet");
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("testRequestScope", "hello,modelandview");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/testModel")
    public String testModel(Model model){
        model.addAttribute("testRequestScope", "hello,model");
        return "success";

    }

    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map){
        map.put("testRequestScope", "hello,map");
        return "success";
    }
    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap){
        modelMap.addAttribute("testRequestScope", "hello,modelMap");
        return "success";
    }

    @RequestMapping("testSession")
    public String testSession(HttpSession httpSession){
        httpSession.setAttribute("testRequestScope","hello,session");
        return "success";
    }

    @RequestMapping("/testApplication")
    public String testApplication(HttpSession httpSession){
        ServletContext servletContext = httpSession.getServletContext();
        servletContext.setAttribute("testRequestScope", "hello,application");
        return "success";

    }
}
