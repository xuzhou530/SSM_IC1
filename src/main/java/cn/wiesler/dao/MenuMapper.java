package cn.wiesler.dao;

import cn.wiesler.pojo.Menu;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}