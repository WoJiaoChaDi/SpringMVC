package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {

    private static final String SUCCESS = "success";

    /**
     * 1. @RequestMapping 除了修饰方法, 还可来修饰类
     * 2. 1). 类定义处: 提供初步的请求映射信息。相对于 WEB 应用的根目录
     *    2). 方法处: 提供进一步的细分映射信息。 相对于类定义处的 URL。若类定义处未标注 @RequestMapping，则方法处标记的 URL
     * 相对于 WEB 应用的根目录
     */
    @RequestMapping("/testRequestMapping")
    public String testRequestMapping() {
        System.out.println("testRequestMapping");
        return SUCCESS;
    }

    /**
     * 常用: 使用 method 属性来指定请求方式
     */
    @RequestMapping(value = "/testMethod", method = RequestMethod.POST)
    public String testMethod() {
        System.out.println("testMethod");
        return SUCCESS;
    }

    /**
     * 了解: 可以使用 params 和 headers 来更加精确的映射请求. params 和 headers 支持简单的表达式.
     *
     * @return
     */
    @RequestMapping(value = "testParamsAndHeaders",
                    //参数少一个，错一个都不行
                    params = { "username", "age!=10" },
                    //指定headers属性值
                    headers = { "Accept-Language=en,zh-CN;q=0.9,zh;q=0.8" })
    public String testParamsAndHeaders() {
        System.out.println("testParamsAndHeaders");
        return SUCCESS;
    }

    /**
     * Ant 风格资源地址支持 3 种匹配符：
     *      ?：匹配文件名中的一个字符
     *      *：匹配文件名中的任意字符
     *      **：** 匹配多层路径
     */
    @RequestMapping("/testAntPath/*/abc")
    public String testAntPath() {
        System.out.println("testAntPath");
        return SUCCESS;
    }


    /**
     * @PathVariable 可以来映射 URL 中的占位符到目标方法的参数中.
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer id) {
        System.out.println("testPathVariable: " + id);
        return SUCCESS;
    }

    /**
     * Rest 风格的 URL.
     * 以 CRUD 为例:
     * 新增: /order POST
     * 修改: /order/1 PUT update?id=1
     * 获取:/order/1 GET get?id=1
     * 删除: /order/1 DELETE delete?id=1
     *
     * 如何发送 PUT 请求和 DELETE 请求呢 ?
     * 1. 需要配置 HiddenHttpMethodFilter
     * 2. 需要发送 POST 请求
     * 3. 需要在发送 POST 请求时携带一个 name="_method" 的隐藏域, 值为 DELETE 或 PUT
     *
     * 在 SpringMVC 的目标方法中如何得到 id 呢? 使用 @PathVariable 注解
     *
     */
    @RequestMapping(value = "/testRest/{id}/{id2}", method = RequestMethod.GET)
    public String testRest(@PathVariable Integer id, @PathVariable Integer id2) {
        System.out.println("testRest GET: " + id + ":" + id2);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest", method = RequestMethod.POST)
    public String testRest() {
        System.out.println("testRest POST");
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    public String testRestPut(@PathVariable Integer id) {
        System.out.println("testRest PUT: " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
    public String testRestDelete(@PathVariable Integer id) {
        System.out.println("testRest DELETE: " + id);
        return SUCCESS;
    }

    /**
     * @RequestParam 来映射请求参数.
     * value 值即请求参数的参数名
     * required 该参数是否必须. 默认为 true
     * defaultValue 请求参数的默认值
     */
    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(
            @RequestParam(value = "username") String un,
            @RequestParam(value = "age", required = false, defaultValue = "0") int age) {
        System.out.println("testRequestParam, username: " + un + ", age: " + age);
        return SUCCESS;
    }

}
