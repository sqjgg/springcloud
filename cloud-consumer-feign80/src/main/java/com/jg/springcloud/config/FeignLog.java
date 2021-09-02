package com.jg.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Package: com.jg.springcloud.config
 * @ClassName: FeignLog
 * @Author: Levi
 * @CreateTime: 2021/8/29 16:31
 * @Description:
 */
@Configuration
public class FeignLog {

    @Bean
    public Logger.Level getLogger(){
        return Logger.Level.FULL;
    }
}
