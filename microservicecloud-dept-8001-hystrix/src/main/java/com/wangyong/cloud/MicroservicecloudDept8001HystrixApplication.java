package com.wangyong.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(value="com.wangyong.cloud.mapper")
@EnableEurekaClient
@EnableCircuitBreaker//对hystrixR熔断机制的支持
@EnableDiscoveryClient //服务发现
public class MicroservicecloudDept8001HystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudDept8001HystrixApplication.class, args);
	}

}
