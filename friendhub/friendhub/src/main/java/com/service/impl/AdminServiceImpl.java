package com.service.impl;

import com.dao.AdminMapper;
import com.pojo.Admin;
import com.pojo.AdminExample;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public void add(Admin admin) {
        adminMapper.insert(admin);
    }

    @Override
    public void delete(int id) {
        adminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Admin admin) {
        adminMapper.updateByPrimaryKeySelective(admin);
    }

    @Override
    public Admin get(String adminName, String password) {
        AdminExample example=new AdminExample();
        example.createCriteria().andAdminNameEqualTo(adminName).andPasswordEqualTo(password);
        List<Admin> result=adminMapper.selectByExample(example);
        if(result.isEmpty()){
            return null;
        }
        return result.get(0);
    }

    @Override
    public int getNum() {
        AdminExample example=new AdminExample();
        example.setOrderByClause("id desc");
        return adminMapper.selectByExample(example).size();
    }

    @Override
    public List<Admin> selectAll() {
        AdminExample example=new AdminExample();
        example.setOrderByClause("id desc");
        List<Admin> ad=adminMapper.selectByExample(example);
        return ad;
    }

    @Override
    public Admin select(int id) {
        return adminMapper.selectByPrimaryKey(id);
    }
}
