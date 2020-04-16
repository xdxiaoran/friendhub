package com.service.impl;

import com.dao.UserMapper;
import com.pojo.User;
import com.pojo.UserExample;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServieImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public int getNum() {
        UserExample example=new UserExample();
        example.setOrderByClause("id desc");
        return userMapper.selectByExample(example).size();
    }

    @Override
    public List<User> selectAll() {
        UserExample example=new UserExample();
        example.setOrderByClause("id desc");
        List<User> all=userMapper.selectByExample(example);
        return all;
    }

    @Override
    public void delete(int id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public User select(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }
}
