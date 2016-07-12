package cn.wiesler.controller;

import cn.wiesler.exception.CustomException;
import cn.wiesler.pojo.Users;
import cn.wiesler.pojo.UsersCustom;
import cn.wiesler.service.IUsersService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by 时光机器 on 2016/7/11.
 */
@Controller
@RequestMapping("/users")
public class UsersController {
    @Resource
    private IUsersService usersService;
    //浏览器地址栏里的目录是根据@RequestMapping来写的，和return的真实目录是没有关系的
    //去掉了@RequestParam因为方法写的有问题，不好控制RESTFul，RESTFul中{uid}就是需要传入的参数
    @RequestMapping("/showUsers/{uid}")
    public String showUsers(Model model, @PathVariable("uid") Integer uid) throws Exception{
        UsersCustom usersCustom = this.usersService.getUsersById(uid);
        //判断根据id查找的数据是否存在。一般与业务无关的异常在Controller中抛出，例如输入长度等
        /*if(usersCustom == null){
            throw new CustomException("查找的用户不存在！");
        }*/
        model.addAttribute("usersCustom", usersCustom);
        return "Users/showUsers";
    }

    @RequestMapping("/addUsers")
    public String addUsers(){
        return "Users/addUsers";
    }

    @RequestMapping("/addUsersSubmit")
    public String addUsersSubmit(Model model, UsersCustom usersCustom){
        this.usersService.addUsers(usersCustom);
        return "Users/showUsers";
    }

}
