package com.wangyong.cloud.myRule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gervard on 2019/3/19.
 */
@Configuration
public class MyRibboRule {

    @Bean
    public IRule myRule(){
        return new RoundRobinRule_wy();
    }
}
