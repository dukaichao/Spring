package com.dkc.bz;

import com.dkc.po.UserEx;

import java.util.List;

public class UserBz {

    private UserEx userEx;

    private List<Integer> list;

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public UserEx getUserEx() {
        return userEx;
    }

    public void setUserEx(UserEx userEx) {
        this.userEx = userEx;
    }
}
