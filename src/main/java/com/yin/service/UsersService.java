package com.yin.service;

import com.yin.dao.UserInfoMapper;
import com.yin.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo getUserById(int id){
        return userInfoMapper.selectByPrimaryKey(id);
    }

    public void insertUser(UserInfo userInfo){
        userInfoMapper.insertSelective(userInfo);
    }

}
