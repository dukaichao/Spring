package com.dkc.mapper;

import com.dkc.bz.UserBz;
import com.dkc.po.OrderEx;
import com.dkc.po.Orders;
import com.dkc.po.User;
import com.dkc.po.UserEx;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/10
 * Time:11:36
 */

public class UserMapperTest {
    private SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void initial(){
        String file = "sqlMapConfig.xml";
        InputStream in = null;
        try{
            in = Resources.getResourceAsStream(file);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testQuery(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<UserEx> query = userMapper.query();
            System.out.println(query);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testQueryByName(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{

            UserEx userEx = new UserEx();
            userEx.setUsername("vin");
            UserBz userBz = new UserBz();
            userBz.setUserEx(userEx);
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<UserEx> userExes = userMapper.queryByName(userBz);
            System.out.println(userExes);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testQueryByJoin(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
            List<OrderEx> orderExes = orderMapper.queryByJoin();
            System.out.println(orderExes);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testQueryInfo(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
            List<Orders> orders = orderMapper.queryInfo();
            System.out.println(orders);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testQueryGet(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(24);
            list.add(25);
            UserBz userBz = new UserBz();
            userBz.setList(list);
            UserMapper orderMapper = sqlSession.getMapper(UserMapper.class);
            List<User> orders = orderMapper.queryGet(userBz);
            System.out.println(orders);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}