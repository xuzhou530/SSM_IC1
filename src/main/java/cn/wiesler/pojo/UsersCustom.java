package cn.wiesler.pojo;

import java.util.List;

/**
 * Created by 时光机器 on 2016/7/11.
 */
public class UsersCustom extends Users {

    //Mapping properties, Query Users associated with Orders and Orderdetails and Menu (multi-to-multi query)
    //The corresponding relationship between the Users and the Orders is one-to-multi, so make a List to here
    List<OrdersCustom> ordersCustomList;

    public List<OrdersCustom> getOrdersCustomList() {
        return ordersCustomList;
    }

    public void setOrdersCustomList(List<OrdersCustom> ordersCustomList) {
        this.ordersCustomList = ordersCustomList;
    }

}
