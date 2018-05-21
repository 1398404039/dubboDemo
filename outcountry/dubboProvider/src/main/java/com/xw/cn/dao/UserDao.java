package com.xw.cn.dao;

import com.xw.cn.entity.UserEntity;

import java.util.List;

public interface UserDao {
    List<UserEntity> getAllUsers();
}
