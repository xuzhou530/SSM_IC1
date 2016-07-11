package cn.wiesler.controller;

import cn.wiesler.pojo.Users;
import cn.wiesler.service.IUsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by 时光机器 on 2016/7/11.
 */
@Controller
//@RequestMapping("/users")
public class UsersController {
    @Resource
    private IUsersService usersService;
    //浏览器地址栏里的目录是根据@RequestMapping来写的，和return的真实目录是没有关系的
    @RequestMapping("/showUsers")
    public String showUsers(Model model, @RequestParam(value="uid", defaultValue="1") Integer uid) {
        Users users = this.usersService.getUsersById(uid);
        model.addAttribute("users", users);
        return "Users/showUsers";
    }
}
