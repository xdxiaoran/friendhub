package com.service.impl;

import com.dao.TopicMapper;
import com.dao.TopicPictureMapper;
import com.dao.UserMapper;
import com.pojo.*;
import com.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    TopicMapper topicMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    TopicPictureMapper topicPictureMapper;
    @Override
    public int getNum() {
        TopicExample example=new TopicExample();
        example.setOrderByClause("id desc");
        return topicMapper.selectByExample(example).size();
    }
    @Override
    public List<Topic> selectAll() {
        TopicExample example=new TopicExample();
        example.setOrderByClause("id desc");
        List<Topic> allTopic=topicMapper.selectByExample(example);
        return allTopic;
    }
    public void setUser(Topic topic){
        int uid=topic.getUid();
        User user=userMapper.selectByPrimaryKey(uid);
        topic.setUser(user);
    }
    public void setUser(List<Topic> topics) {
        for (Topic topic : topics) {
            setUser(topic);
        }
    }
    @Override
    public Topic select(int id) {
        return topicMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delete(int id) {
        topicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(Topic topic) {
        topicMapper.insert(topic);
    }

    @Override
    public void update(Topic topic) {
        topicMapper.updateByPrimaryKeySelective(topic);
    }

    @Override
    public void setPic(Topic topic) {
        int id=topic.getId();
        TopicPictureExample example=new TopicPictureExample();
        example.createCriteria().andTidEqualTo(id);
        List<TopicPicture> tps=topicPictureMapper.selectByExample(example);
        List<String> tpss=new ArrayList<>();
        for(TopicPicture topicPicture:tps){
            String pic=topicPicture.getPrefix()+".jpg";
            tpss.add(pic);
        }
        topic.setPts(tpss);
    }

    @Override
    public void srtPic(List<Topic> topics) {
        for(Topic topic:topics){
            setPic(topic);
        }
    }
}
