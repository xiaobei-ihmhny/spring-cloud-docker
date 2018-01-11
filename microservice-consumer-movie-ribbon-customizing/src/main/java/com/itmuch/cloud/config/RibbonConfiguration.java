package com.itmuch.cloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule() {
        //负载均衡规则，改为随机
        return new RandomRule();
    }
}
