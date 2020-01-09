package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ViewResolver")
@Controller
public class SpringMVCTest_ViewResolver {

    private static final String SUCCESS = "success_ViewResolver";

    @RequestMapping("/testViewAndViewResolver")
    public String testViewAndViewResolver(){
        System.out.println("testViewAndViewResolver");
        return SUCCESS;
    }

    //自定义视图解析器
    @RequestMapping("/testView")
    public String testView(){
        System.out.println("testView");
        return "helloView";
    }
}
