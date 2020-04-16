package com.service;
import com.pojo.User;

import  java.util.List;
public interface UserService {
    int getNum();
    List<User> selectAll();
    void delete(int id);
    void add(User user);
    User select(int id);
    void update(User user);
}
