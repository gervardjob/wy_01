package com.wangyong.cloud.controller;

import com.wangyong.cloud.entities.Dept;
import com.wangyong.cloud.service.DptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gervard on 2019/3/16.
 */
@RestController
public class DeptController {
    @Autowired
    DptService dptService;

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable(value = "id") Integer id ){

        return  dptService.get(id) ;
    }

    @PostMapping(value="/dept/add")
    public boolean add(@RequestBody  Dept dept){
        return  dptService.add(dept);
    }
    @GetMapping(value="/dept/list")
    public List<Dept> list(){
        return dptService.list();
    }
}
