package com.xw.cn.controller;

import com.xw.cn.entity.UserEntity;
import com.xw.cn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

//    @Autowired
    @Resource
    private UserService userSvc;

    @RequestMapping(value = "/getAllUser")
    @ResponseBody
    public List<UserEntity> getAllUser(){
        List<UserEntity> users = userSvc.getAllUsers();
        return users;
    }
}
