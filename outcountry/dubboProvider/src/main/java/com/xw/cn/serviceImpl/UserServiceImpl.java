package com.xw.cn.serviceImpl;

import com.xw.cn.dao.UserDao;
import com.xw.cn.entity.UserEntity;
import com.xw.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<UserEntity> getAllUsers() {
        return userDao.getAllUsers();
    }
}
