SpringCloud整合openfeign注意事项：
(1).启动类使用注解并配置要扫描的包路径,例如:@EnableFeignClients(basePackages = "com.discovery.consumer.service")
(2).@FeignClient注解的远程调用接口,声明的接口方法要与服务提供方提供的方法保持一致(mapping,@ResponseBody,@RequestBody,@RequestParam,@PathVariable("xxx")等)