package com.sunlight.learnnacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunlight
 * 测试配置中心的控制器
 */
@RestController
@RequestMapping("/config")
@RefreshScope //通过 Spring Cloud 原生注解 @RefreshScope 实现配置自动更新
public class ConfigController {

    @Value("${config.useLocalCache}")
    private boolean useLocalCache;

    @RequestMapping("/get")
    public boolean get() {
        return useLocalCache;
    }
}