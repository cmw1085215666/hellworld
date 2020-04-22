package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author chenmingwen
 * Create Time : 2020/4/17 17:38
 */
@SpringBootApplication(scanBasePackages = {"com"})
public class ApplicationApi extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(ApplicationApi.class);
    }

    public static void main(String[] args) {
        /*开发*/


        //第二行
        //第一行
        SpringApplication.run(ApplicationApi.class, args);
    }
}
