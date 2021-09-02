package com.jg.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Package: com.jg.myrule
 * @ClassName: Myrule
 * @Author: Levi
 * @CreateTime: 2021/8/26 15:36
 * @Description:
 */
@Configuration
public class Myrule {

    @Bean
    public IRule myRule(){
        return new RandomRule();//随机规则
    }
}
