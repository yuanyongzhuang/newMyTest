package com.example.consumer.controller;

import com.example.consumer.remote.RemoteClient;
import com.example.consumer.service.TestOrderHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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

    @Autowired
    List<TestOrderHandler> orderHandlers;

    @GetMapping("/helloNacos")
    public String helloNacos(){
        return restTemplate.getForObject("http://nacos-provide/helloNacos",String.class);
    }
    @GetMapping("/feignNacos")
    public String feignNacos(){
        return remoteClient.helloNacos()    ;
    }

    /**
     * 测试order注解的执行顺序  有order注解优先与无order注解
     */
    @GetMapping("/testOrder")
    public void testOrder(){
        orderHandlers.forEach(order ->{
            order.setOrderImpl();
        });
    }
}
