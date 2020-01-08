package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//RequestMapping 路径定义  web项目/类/方法   所以类没有定义的话就是： web项目/方法
@RequestMapping("/springmvc")
@Controller
public class HelloWorld {

    /**
     * 1. 使用 @RequestMapping 注解来映射请求的 URL
     * 2. 返回值会通过视图解析器解析为实际的物理视图, 对于 InternalResourceViewResolver 视图解析器, 会做如下的解析:
     * 通过 prefix + returnVal + 后缀 这样的方式得到实际的物理视图, 然会做转发操作
     *
     * /WEB-INF/views/success.jsp
     *
     * @return
     */
    @RequestMapping("/helloworld")
    public String hello() {
        System.out.println("hello world!");
        return "success";
    }
}
