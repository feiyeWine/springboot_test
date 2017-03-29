package com.yin.controller;

import com.yin.model.UserInfo;
import com.yin.service.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by YR on 2017/3/24
 */

@RestController
@RequestMapping("/user")
public class UsersController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UsersController.class);

    @Autowired
    private UsersService usersService;

    @GetMapping("/{id}")
    public UserInfo getUser(@PathVariable int id){
        LOGGER.info("id:" + id);
        return usersService.getUserById(id);
    }
    @PostMapping("/")
    public void insertUserInfo(@RequestBody UserInfo userInfo){
        LOGGER.info(userInfo.toString());
        usersService.insertUser(userInfo);
    }
}
