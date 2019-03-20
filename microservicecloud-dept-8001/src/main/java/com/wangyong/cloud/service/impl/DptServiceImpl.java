package com.wangyong.cloud.service.impl;

import com.wangyong.cloud.entities.Dept;
import com.wangyong.cloud.mapper.DeptMapper;
import com.wangyong.cloud.service.DptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gervard on 2019/3/16.
 */
@Service
public class DptServiceImpl implements DptService {
    @Autowired
    DeptMapper deptMapper;

    @Override
    public Dept get(Integer id) {
        return deptMapper.get(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    @Override
    public boolean add(Dept dept) {
        return deptMapper.add(dept);
    }
}
