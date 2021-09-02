package com.jg.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Package: com.jg.springcloud.config
 * @ClassName: RestTemplateConfig
 * @Author: Levi
 * @CreateTime: 2021/8/25 20:02
 * @Description:
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
