package com.wangyong.cloud;

import com.wangyong.cloud.myRule.MyRibboRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyRibboRule.class)
public class MicroservicecloudDeptConsumer80Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudDeptConsumer80Application.class, args);
	}

}
