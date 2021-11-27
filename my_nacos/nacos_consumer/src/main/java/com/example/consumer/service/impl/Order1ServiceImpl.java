package com.example.consumer.service.impl;

import com.example.consumer.service.TestOrderHandler;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @author yyz
 * @date 2021/11/2218:41
 */
@Order(1)
@Service("order1ServiceImpl")
public class Order1ServiceImpl implements TestOrderHandler {
    @Override
    public void setOrderImpl() {
        System.out.println("order 1 service");
        throw new RuntimeException("人为异常，验证@order注解在异常下的运行。");
    }
}
