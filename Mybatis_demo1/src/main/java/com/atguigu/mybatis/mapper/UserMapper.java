package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    /*
Mybatis面向接口编程的两个一致：
1.映射文件的namespace要和mapper接口的全类名保持一直

2。映射文件中SQL语句的id要和mappper接口中的方法名一致
 */

    //添加用户信息
    int insertUser();

    //更新用户信息
    int updateUser();

    //删除用户信息
    int deleteUser();

    //查询用户信息
    User getUserById();

    //查询所有的用户信息
    List<User> getAllUser();
}
