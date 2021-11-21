package com.example.provide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yyz
 * @date 2021/11/2022:58
 */
@RestController
public class HelloNacosController {

    @GetMapping("/helloNacos")
    public String helloNacos(){
        return "你好， nacos";
    }
}
