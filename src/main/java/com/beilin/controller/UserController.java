package com.beilin.controller;

import com.beilin.entity.User;
import com.beilin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

        //插入user
    @RequestMapping("/user")
    public void insert( User user) {
        userMapper.insert(user);
    }

      //根据id删除
    @RequestMapping("/user1/{id}")
    public void delete(@PathVariable("id") Integer id) {
        userMapper.delete(id);
    }
        //修改
    @RequestMapping("/user2/{id}")
    public void update(User user,@PathVariable("id") Integer id) {
        userMapper.update(user);
    }

     //根据id查询学生
    @RequestMapping("/user3/{id}")
    public User getById(@PathVariable("id") Integer id) {
        User user = userMapper.getById(id);
        return user;
    }

    //查询全部
    @RequestMapping("/users")
    public List<User> list(){
        List<User> users = userMapper.list();
        return users;
    }

}
