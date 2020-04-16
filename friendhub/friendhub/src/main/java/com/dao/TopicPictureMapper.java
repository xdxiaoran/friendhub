package com.dao;

import com.pojo.TopicPicture;
import com.pojo.TopicPictureExample;
import java.util.List;

public interface TopicPictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TopicPicture record);

    int insertSelective(TopicPicture record);

    List<TopicPicture> selectByExample(TopicPictureExample example);

    TopicPicture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TopicPicture record);

    int updateByPrimaryKey(TopicPicture record);
}