package com.dao;

import com.pojo.Concern;
import com.pojo.ConcernExample;
import java.util.List;

public interface ConcernMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Concern record);

    int insertSelective(Concern record);

    List<Concern> selectByExample(ConcernExample example);

    Concern selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Concern record);

    int updateByPrimaryKey(Concern record);
}