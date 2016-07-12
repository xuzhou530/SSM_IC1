package cn.wiesler.service.impl;

import cn.wiesler.dao.UsersMapper;
import cn.wiesler.exception.CustomException;
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

    public UsersCustom getUsersById(Integer uid) throws Exception{
        Users users = usersMapper.selectByPrimaryKey(uid);
        //一般与业务相关的异常都在Service层中抛出
        if(users == null){
            throw new CustomException("查找的用户不存在！");
        }
        //中间进行业务处理....
        //....
        //这里定义userCustom，下面可以返回UsersCustom
        UsersCustom usersCustom = null;
        //将users中的属性值拷贝到usersCustom中，再返回
        if(users != null){
            usersCustom = new UsersCustom();
            BeanUtils.copyProperties(users, usersCustom);
        }
        return usersCustom;
    }

    public void addUsers(UsersCustom usersCustom) {
        usersMapper.insert(usersCustom);
    }

/*
    public void updateUsersById(Integer uid, UsersCustom usersCustom) {
        //在业务层插入、更新数据时要进行是否为空等校验,int不能校验，所以一般都定义为Integer
        usersCustom.setUid(uid);
        usersMapper.updateByPrimaryKey(usersCustom);
    }
*/

}
