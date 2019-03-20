package com.wangyong.cloud;

import com.wangyong.cloud.mapper.DeptMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroservicecloudDept8001ApplicationTests {
	@Autowired
	DeptMapper mapper;
	@Test
	public void contextLoads() {
	}

	@Test
	public void listDept(){
		mapper.list();
	}

}
