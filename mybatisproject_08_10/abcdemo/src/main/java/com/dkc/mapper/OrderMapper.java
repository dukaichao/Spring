package com.dkc.mapper;

import com.dkc.po.OrderEx;
import com.dkc.po.Orders;

import java.util.List;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/10
 * Time:14:51
 */
public interface OrderMapper {

    public List<OrderEx> queryByJoin() throws Exception;

    public List<Orders> queryInfo() throws Exception;
}
