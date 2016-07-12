package cn.wiesler.pojo;

/**
 * Created by 时光机器 on 2016/7/12.
 * 包装类，便于管理用户、商品等。如果用户、商品信息都在一个类中是简单属性，就会杂乱，不便于维护
 * 适用情况：页面传输不是简单类型的数据绑定时(Custom、List等)，查询条件包含多表时
 */


public class QueryVo {

    private Users users;

    private UsersCustom usersCustom;

    private Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public UsersCustom getUsersCustom() {
        return usersCustom;
    }

    public void setUsersCustom(UsersCustom usersCustom) {
        this.usersCustom = usersCustom;
    }
}
