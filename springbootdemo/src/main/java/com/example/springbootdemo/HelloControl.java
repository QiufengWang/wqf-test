package com.example.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wangqiufeng
 * @date : 15:54 2020/7/6
 */

@RestController
@RequestMapping("/hello")
public class HelloControl {

    @RequestMapping("hello")
    public String hello() {
        return "Hello this is my first springboot demo";
    }

}
