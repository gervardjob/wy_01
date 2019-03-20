package com.wangyong.cloud.service;

import com.wangyong.cloud.entities.Dept;

import java.util.List;

/**
 * Created by gervard on 2019/3/16.
 */
public interface DptService {

    public Dept get(Integer id);

    public List<Dept> list ();

    public boolean add(Dept dept);
}
