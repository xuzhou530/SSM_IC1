package cn.wiesler.service.impl;

import cn.wiesler.dao.OrdersMapper;
import cn.wiesler.dao.UsersMapper;
import cn.wiesler.pojo.OrdersCustom;
import cn.wiesler.service.IOrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 时光机器 on 2016/7/18.
 */
@Service("ordersService")
public class OrdersServiceImpl implements IOrdersService{

    @Resource
    private OrdersMapper ordersMapper;

    public List<OrdersCustom> findOrdersUsers() throws Exception {
        List<OrdersCustom> ordersCustom = ordersMapper.findOrdersUsers();
        return ordersCustom;
    }

}
