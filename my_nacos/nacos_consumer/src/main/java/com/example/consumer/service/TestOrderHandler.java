package com.example.consumer.service;

import com.example.consumer.dto.TestDto;

/**
 * 测试@Reder注解
 * @author yyz
 * @date 2021/11/2218:39
 */
public interface TestOrderHandler {

  void setOrderImpl(TestDto testDto);
}
