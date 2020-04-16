package com.dao;

import com.pojo.TopicComment;
import com.pojo.TopicCommentExample;
import java.util.List;

public interface TopicCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TopicComment record);

    int insertSelective(TopicComment record);

    List<TopicComment> selectByExample(TopicCommentExample example);

    TopicComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TopicComment record);

    int updateByPrimaryKey(TopicComment record);
}