package com.example.consumer.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class TestParams implements Serializable {
    private String name;
    private String age;
}
