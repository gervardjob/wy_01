package com.wangyong.cloud.controller;

import com.wangyong.cloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by gervard on 2019/3/17.
 */
@RestController
public class DeptController_Consumer {
    private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";
    /***
     * 使用restTemplate访问restful接口非常的简单粗暴简单
     * （url,requestMap,ResponseBean.class）这三个参数分别代表REST请求地址，请求参数,HTTP响应被转换的对象
     */
    @Autowired
    RestTemplate template;

    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id){
       return template.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @GetMapping(value="/consumer/dept/add")
    public boolean add (Dept dept){
        return template.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }
    @GetMapping(value="/consumer/dept/list")
    public List<Dept> list(){
        return template.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }
}
