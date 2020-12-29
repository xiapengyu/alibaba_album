package com.discovery.consumer.controller;

import com.discovery.consumer.service.NacosProviderClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class NacosController {

    @Autowired
    private NacosProviderClient nacosProviderClient;

    @GetMapping(value = "/echo/{content}")
    public String echo(@PathVariable String content) {
        log.info("consumer send {}", content);
        return nacosProviderClient.echo(content);
    }

}
