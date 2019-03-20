package com.wangyong.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(value="com.wangyong.cloud.mapper")
@EnableEurekaClient
public class MicroservicecloudDept8001Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudDept8001Application.class, args);
	}

}
