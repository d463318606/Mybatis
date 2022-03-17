package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SelectMapper {
    //根据id查询用户信息
    User getUserById(@Param("id") Integer id);

    //查询所有用户信息（不能用User接收）
    List<User> getAllUser();

    //查询用户的数量
    Integer getCount();
}
