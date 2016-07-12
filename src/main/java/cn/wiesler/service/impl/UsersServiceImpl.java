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

    public UsersCustom getUsersById(Integer uid) {
        Users users = usersMapper.selectByPrimaryKey(uid);
        //中间进行业务处理....
        //....
        //这里定义userCustom，下面可以返回UsersCustom
        //如果在下面的if外层新建UserCustom构造器的话，userCustom不为空，Controller层就不能通过判断返回的结果是否为空
        //而进行自定义异常处理
        UsersCustom usersCustom = null;
        //将users中的属性值拷贝到usersCustom中，再返回
        //当users内容按ID查找不为空时，再进行属性值拷贝，是为了Controller中showUsers方法进行自定义异常处理
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
