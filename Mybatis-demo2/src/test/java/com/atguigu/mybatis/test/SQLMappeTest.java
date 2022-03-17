package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SQLMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.*;
import java.util.List;

public class SQLMappeTest {
    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        mapper.getUserByLike("信");
    }

    @Test
    public void testDeleteMore(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        int result=mapper.deleteMore("2,3");
        System.out.println("result = " + result);
    }

    @Test
    public void testGetUserTableName(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> list = mapper.getUserByTableName("t_user");
        System.out.println(list);
    }

    @Test
    public  void testJDBC() throws Exception {
        Class.forName("");
        Connection connection = DriverManager.getConnection("", "", "");
        PreparedStatement ps = connection.prepareStatement("", Statement.RETURN_GENERATED_KEYS);
        ps.executeUpdate();
        ResultSet resultSet=ps.getGeneratedKeys();
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user=new User(null,"张","123",18,"男","12356@");
        mapper.insertUser(user);
        System.out.println(user);
    }

}
