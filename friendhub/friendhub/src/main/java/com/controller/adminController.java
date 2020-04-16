package com.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.Admin;
import com.pojo.Topic;
import com.pojo.User;
import com.service.TopicService;
import com.service.UserService;
import com.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.service.AdminService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;



@Controller
public class adminController {
    @Autowired
    AdminService adminService;
    @Autowired
    UserService userService;
    @Autowired
    TopicService topicService;
    //登录页
    @RequestMapping("admin_login")
    public  String toAdmin(){
        return "admin/adminlogin";
    }
    //登录页密码认证
    @RequestMapping("back_login")
    public String adminLogin(Model model, HttpSession session, Admin admin){
        String name=admin.getAdminName();
        String password=admin.getPassword();
        Admin admin1=adminService.get(name,password);
        if (admin1==null) {
            model.addAttribute("msg", "账号密码错误");
            return "admin/adminlogin";
        }
        int userNum=userService.getNum();
        int adminNum=adminService.getNum();
        int topicNum=topicService.getNum();
        model.addAttribute("userNum",userNum);
        model.addAttribute("adminNum",adminNum);
        model.addAttribute("topicNum",topicNum);
        session.setAttribute("admin", admin1);
        return "admin/adminindex";
    }
    //管理员管理页面
    @RequestMapping("admin")
    public String admin(Model model, Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Admin> ad= adminService.selectAll();
        int total = (int) new PageInfo<>(ad).getTotal();
        page.setTotal(total);
        model.addAttribute("ad",ad);
        model.addAttribute("page", page);
        return "admin/admin";
    }
    //删除管理员
    @RequestMapping("admin_delete")
    public  String deleteAdmin(int id){
        adminService.delete(id);
        return "redirect:/admin";
    }
    //编辑管理员
    @RequestMapping("admin_edit")
        public String editAdmin(int id,Model model){
          Admin admin=adminService.select(id);
          model.addAttribute("admin1",admin);
          return "admin/adminedit";
        }
        //修改管理员密码
    @RequestMapping("edit_password")
      public String editAdminPassword(Admin admin,Model model){
        adminService.update(admin);
        return "redirect:/admin_edit?id="+admin.getId();
    }
    @RequestMapping("add_admin")
     public String addAdmin(Admin admin){
        adminService.add(admin);
        return "redirect:/admin";
    }
    //用户管理
    @RequestMapping("user")
    public String adminUser(Model model,Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<User> users= userService.selectAll();
        int total = (int) new PageInfo<>(users).getTotal();
        page.setTotal(total);
        model.addAttribute("users",users);
        model.addAttribute("page", page);
        return "admin/user";
    }
    //删除用户
    @RequestMapping("user_delete")
    public String userDelete(int id){
        userService.delete(id);
        return  "redirect:/user";
    }
    //增加用户
    @RequestMapping("add_user")
    public  String userAdd(User user){
        userService.add(user);
        return "redirect:/user";
    }
    //编辑用户
    @RequestMapping("user_edit")
    public  String userEdit(Model model,int id){
        User user=userService.select(id);
        model.addAttribute("user",user);
        return "admin/useredit";
    }
    //编辑用户资料
    @RequestMapping("edit_post")
    public String editUserInfo(Model model,User user){
        userService.update(user);
        return "redirect:/user";
    }
    @RequestMapping("topic")
    public  String topic(Model model,Page page){
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Topic> topics= topicService.selectAll();
        int total = (int) new PageInfo<>(topics).getTotal();
        page.setTotal(total);
        topicService.setUser(topics);
        model.addAttribute("topics",topics);
        model.addAttribute("page",page);
        return  "admin/topic";
    }
    //删除帖子
    @RequestMapping("topic_delete")
    public String topicDel(int id){
       topicService.delete(id);
       return "redirect:/topic";
    }
    //帖子详情
    @RequestMapping("topic_detail")
    public  String topicDetail(Model model,int id){
        Topic topic=topicService.select(id);
        topicService.setPic(topic);
        model.addAttribute("topic",topic);
        return "admin/topicdetail";
    }
    }

