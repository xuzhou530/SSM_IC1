package cn.wiesler.pojo;

/**
 * Created by 时光机器 on 2016/7/18.
 */
public class OrderDetailsCustom extends OrderDetails {

    // Mapping properties, Query Users associated with Orders and Orderdetails and Menu (multi-to-multi query)
    //The corresponding relationship between the Orderdetails and the Menu is one-to-one, so make a object to here
    MenuCustom menuCustom;

    public MenuCustom getMenuCustom() {
        return menuCustom;
    }

    public void setMenuCustom(MenuCustom menuCustom) {
        this.menuCustom = menuCustom;
    }
}
