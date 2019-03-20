package com.wangyong.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
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
