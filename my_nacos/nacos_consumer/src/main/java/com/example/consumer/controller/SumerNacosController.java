package com.example.consumer.controller;

import com.example.consumer.dto.TestDto;
import com.example.consumer.remote.RemoteClient;
import com.example.consumer.service.TestOrderHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
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
        TestDto testDto = new TestDto();
        orderHandlers.forEach(order ->{
            order.setOrderImpl(testDto);
        });
        System.out.println(testDto.toString());
    }

    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        String s = hashMap.putIfAbsent("12", "23");
        String s1 = hashMap.putIfAbsent("23", "34");
        String s2 = hashMap.putIfAbsent("23", "45");
        System.out.println("s="+s+";s1="+s1+";s2="+s2);
    }
}
