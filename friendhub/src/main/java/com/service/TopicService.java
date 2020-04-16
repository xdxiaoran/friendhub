package com.service;
import com.pojo.Topic;
import java.util.List;
public interface TopicService {
    int getNum();
    List<Topic> selectAll();
    Topic select(int id);
    void delete(int id);
    void setUser(Topic topic);
    void setUser(List<Topic> topics);
    void add(Topic topic);
    void update(Topic topic);
    void setPic(Topic topic);
    void srtPic(List<Topic> topics);
}
