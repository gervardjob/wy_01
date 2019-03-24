package com.wangyong.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.wangyong.cloud"})
@ComponentScan("com.wangyong.cloud")
public class MicroservicecloudDeptConsumerFeign80Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudDeptConsumerFeign80Application.class, args);
	}

}
