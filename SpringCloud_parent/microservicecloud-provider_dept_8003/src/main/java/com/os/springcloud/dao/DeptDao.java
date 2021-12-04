package com.os.springcloud.dao;

import com.os.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 数据访问层（接口）
 */
@Mapper
public interface DeptDao {

    List<Dept> selectAll();
}
