package com.example.consumer.service.impl;

import com.example.consumer.service.TestOrderHandler;
import org.springframework.stereotype.Service;

/**
 * @author yyz
 * @date 2021/11/2218:44
 */
@Service("notOrderServiceImpl")
public class NotOrderServiceImpl implements TestOrderHandler {
    @Override
    public void setOrderImpl() {
        System.out.println("not order service");
    }
}
