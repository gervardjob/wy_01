package com.wangyong.cloud.service;

import java.util.List;

import com.wangyong.cloud.entities.Dept;
import org.springframework.stereotype.Component;


import feign.hystrix.FallbackFactory;

@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>
{
	@Override
	public DeptClientService create(Throwable throwable)
	{
		return new DeptClientService() {
			public Dept get(Integer id)
			{
				return new Dept().setId(id).setDpt_name("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
						.setDatasource("no this database in MySQL");
			}

			public List<Dept> list()
			{
				return null;
			}

			public boolean add(Dept dept)
			{
				return false;
			}
		};
	}
}
