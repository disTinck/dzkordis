package com.ora.qh.duapr.Dao;

import com.ora.qh.duapr.entity.UserInfo;
import java.util.List;

public interface UserInfoMapper {
    int insert(UserInfo record);

    List<UserInfo> selectAll();
}