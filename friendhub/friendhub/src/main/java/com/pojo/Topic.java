package com.pojo;

import java.util.Date;
import java.util.List;
public class Topic {
    private Integer id;

    private String title;

    private String content;

    private Integer uid;

    private Date sendDate;

    //非表字段
    private User user;
    private  List<String> pts;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getPts() {
        return pts;
    }

    public void setPts(List<String> pts) {
        this.pts = pts;
    }
}