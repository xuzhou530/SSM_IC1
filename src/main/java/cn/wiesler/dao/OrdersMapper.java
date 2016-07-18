package cn.wiesler.dao;

import cn.wiesler.pojo.Orders;
import cn.wiesler.pojo.OrdersCustom;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    //One-on-one multi-table query
    List<OrdersCustom> findOrdersUsers() throws Exception;
}