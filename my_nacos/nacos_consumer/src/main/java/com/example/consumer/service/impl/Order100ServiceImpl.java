package com.example.consumer.service.impl;

import com.example.consumer.service.TestOrderHandler;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @author yyz
 * @date 2021/11/2218:42
 */
@Order(100)
@Service("order100ServiceImpl")
public class Order100ServiceImpl implements TestOrderHandler {
    @Override
    public void setOrderImpl() {
        System.out.println("order 100 service");
    }
}
