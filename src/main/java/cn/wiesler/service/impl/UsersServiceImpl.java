package cn.wiesler.service.impl;

import cn.wiesler.dao.UsersMapper;
import cn.wiesler.pojo.Users;
import cn.wiesler.pojo.UsersCustom;
import cn.wiesler.service.IUsersService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 时光机器 on 2016/7/11.
 */
@Service("usersService")
public class UsersServiceImpl implements IUsersService {
    @Resource
    private UsersMapper usersMapper;

    public UsersCustom getUsersById(int uid) {
        Users users = usersMapper.selectByPrimaryKey(uid);
        //中间进行业务处理....
        //....
        //返回UsersCustom
        UsersCustom usersCustom = new UsersCustom();
        //将users中的属性值拷贝到usersCustom中，再返回
        BeanUtils.copyProperties(users, usersCustom);
        return usersCustom;
    }
}
