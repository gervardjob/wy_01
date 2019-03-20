package com.wangyong.cloud.mapper;

import com.wangyong.cloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by gervard on 2019/3/16.
 */
public interface DeptMapper {

    public boolean add (Dept dept);

    public List<Dept> list();

    public Dept get(Integer id);
}
