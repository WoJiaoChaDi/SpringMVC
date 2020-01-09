package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/redirectAndForward")
@Controller
public class SpringMVCTest_Redirect_Forward {

    private static final String SUCCESS = "success_Redirect_Forward";

    @RequestMapping("/testNormal")
    public String testNormal(){
        System.out.println("testNormal");
        return "success";
    }
    @RequestMapping("/testForward")
    public String testForward(){
        System.out.println("testForward");
        return "forward:/index.jsp";
    }
    @RequestMapping("/testRedirect")
    public String testRedirect(){
        System.out.println("testRedirect");
        return "redirect:/index.jsp";
    }
}
