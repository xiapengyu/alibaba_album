package com.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//实现配置自动更新
@RefreshScope
public class ConfigController {

    @Value("${config.info}")
    String value;

    @GetMapping("/echo/config")
    public String getConfigValue() {
        return value;
    }
}
