package com.dao;

import com.pojo.UserPicture;
import com.pojo.UserPictureExample;
import java.util.List;

public interface UserPictureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPicture record);

    int insertSelective(UserPicture record);

    List<UserPicture> selectByExample(UserPictureExample example);

    UserPicture selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPicture record);

    int updateByPrimaryKey(UserPicture record);
}