package com.nacos.discovery.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class NacosController {

    @GetMapping(value = "/echo/{content}")
    @ResponseBody
    public String echo(@PathVariable("content") String content) {
        log.info("provider receive {}", content);
        return "Hello Nacos Discovery " + content;
    }

}
