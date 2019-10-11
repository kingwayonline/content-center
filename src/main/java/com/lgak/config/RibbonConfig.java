package com.lgak.config;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced
    @SentinelRestTemplate(fallback = "fallback",fallbackClass = FallBackTest.class)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

//    @Bean
//    public IRule getRule() {
//        return new RandomRule();
//    }
}
