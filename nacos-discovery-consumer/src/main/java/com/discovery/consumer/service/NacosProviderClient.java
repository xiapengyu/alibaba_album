package com.discovery.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "nacos-provider")
public interface NacosProviderClient {

    @GetMapping(value = "/echo/{content}")
    public String echo(@PathVariable("content") String content);

}
