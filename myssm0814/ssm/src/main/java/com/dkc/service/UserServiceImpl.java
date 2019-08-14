package com.dkc.service;

import com.dkc.mapper.UserMapper;
import com.dkc.po.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserListService() throws Exception {
        return userMapper.queryUserList();
    }


}
