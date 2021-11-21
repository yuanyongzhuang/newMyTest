package com.example.consumer.controller;

import com.example.consumer.remote.RemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yyz
 * @date 2021/11/2023:22
 */
@RestController
public class SumerNacosController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    RemoteClient remoteClient;

    @GetMapping("/helloNacos")
    public String helloNacos(){
        return restTemplate.getForObject("http://nacos-provide/helloNacos",String.class);
    }
    @GetMapping("/feignNacos")
    public String feignNacos(){
        return remoteClient.helloNacos()    ;
    }
}
