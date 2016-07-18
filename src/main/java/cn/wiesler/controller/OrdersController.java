package cn.wiesler.controller;

import cn.wiesler.pojo.OrdersCustom;
import cn.wiesler.service.IOrdersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 时光机器 on 2016/7/18.
 */

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Resource
    private IOrdersService ordersService;

    @RequestMapping("/Test")
    public String findOrdersUsers(Model model) throws Exception{
        List<OrdersCustom> ordersCustom = this.ordersService.findOrdersUsers();
        model.addAttribute("ordersCustom", ordersCustom);
        return "Test";
    }
}
