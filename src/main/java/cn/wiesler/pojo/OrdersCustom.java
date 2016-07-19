package cn.wiesler.pojo;

import java.util.List;

/**
 * Created by 时光机器 on 2016/7/18.
 */
public class OrdersCustom extends Orders {

    //用户信息
    UsersCustom usersCustom;

    //OrderDetails List
    //Mapping properties, Query Users associated with Orders and Orderdetails and Menu (multi-to-multi query)
    //The corresponding relationship between the Orders and the Orderdetails is one-to-multi, so make a List to here
    List<OrderDetailsCustom> orderDetailsCustom;

    public UsersCustom getUsersCustom() {
        return usersCustom;
    }

    public void setUsersCustom(UsersCustom usersCustom) {
        this.usersCustom = usersCustom;
    }

    public List<OrderDetailsCustom> getOrderDetailsCustom() {
        return orderDetailsCustom;
    }

    public void setOrderDetailsCustom(List<OrderDetailsCustom> orderDetailsCustoms) {
        this.orderDetailsCustom = orderDetailsCustoms;
    }
}
