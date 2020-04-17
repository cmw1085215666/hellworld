package com.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmingwen
 * Create Time : 2020/4/17 17:41
 */
@RestController
@RequestMapping("/HelloWorld")
public class HelloWorld {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "helloWorld";
    }

}
