package com.beilin.mapper;

import com.beilin.entity.User;

import java.util.List;

public interface UserMapper {

     //插入
    public void insert(User user);

    //根据id删除
    public void delete(Integer id);

     //根据user的id修改
    public void update(User user);

    //根据id查询
    public User getById(Integer id);

    //查询全部
    public List<User> list();

}
