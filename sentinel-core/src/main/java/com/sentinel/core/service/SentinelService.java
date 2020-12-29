package com.sentinel.core.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class SentinelService {

    @SentinelResource(value = "hello")
    public String hello(){
        return "Hello world!!!";
    }

}
