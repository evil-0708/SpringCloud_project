package com.os.springcloud.dao;

import com.os.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptDao {

    Dept selectById(Long id);
}
