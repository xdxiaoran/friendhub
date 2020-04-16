package com.service;

import com.pojo.Admin;
import java.util.List;
public interface AdminService {
    Admin select(int id);
    void add(Admin admin);
    void delete(int id);
    void update(Admin admin);
    Admin get(String adminName,String password);
    int getNum();
    List<Admin> selectAll();
}
