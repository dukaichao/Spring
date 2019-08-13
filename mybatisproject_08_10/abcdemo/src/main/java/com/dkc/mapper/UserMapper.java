package com.dkc.mapper;

import com.dkc.bz.UserBz;
import com.dkc.po.User;
import com.dkc.po.UserEx;

import java.util.List;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/10
 * Time:11:30
 */
public interface UserMapper {
    public List<UserEx> query() throws Exception;

    public List<UserEx> queryByName(UserBz userBz) throws Exception;

    public List<User> queryGet(UserBz userBz) throws Exception;
}
