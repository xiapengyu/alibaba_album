package com.sentinel.core.controller;

import com.sentinel.core.service.SentinelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelController {

    @Autowired
    private SentinelService sentinelService;

    @GetMapping("/echo/hello")
    public String hello(){
        return sentinelService.hello();
    }

}
