package com.wangyong.cloud.service;

import java.util.List;

import com.wangyong.cloud.entities.Dept;
import org.springframework.stereotype.Component;


import feign.hystrix.FallbackFactory;

@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>
{
	@Override
	public DeptClientService create(Throwable throwable){

		return new DeptClientService() {
			@Override
			public Dept get(Integer id) {
				return new Dept().setDpt_name("hehe");
			}

			@Override
			public List<Dept> list() {
				return null;
			}

			@Override
			public boolean add(Dept dept) {
				return false;
			}

		};
	}
}
