package com.wangyong.cloud.controller;

import com.wangyong.cloud.entities.Dept;
import com.wangyong.cloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gervard on 2019/3/17.
 */
@RestController
public class DeptController_Consumer {
    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/dept/consumer/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Integer id){
       return  this.service.get(id);
    }

    @RequestMapping(value = "/dept/consumer/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return this.service.list();
    }

    @RequestMapping(value = "/dept/consumer/add" ,method = RequestMethod.POST)
    public boolean add(Dept dept){
        return this.service.add(dept);
    }
}
