package com.example.consumer.remote;

import org.springframework.stereotype.Component;

/**
 * fegin调用失败处理
 * @author yyz
 * @date 2021/11/2023:45
 */
@Component
public class RemoteHystrix implements RemoteClient {
    @Override
    public String helloNacos() {
        return "请求超时了";
    }
}

