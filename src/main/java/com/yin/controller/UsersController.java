package com.yin.controller;

import com.yin.model.UserInfo;
import com.yin.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by YR on 2017/3/24
 */

@RestController
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("/{id}")
    public UserInfo getUser(@PathVariable int id){
        return usersService.getUserById(id);
    }
    @PostMapping("/{id}")
    public void insertUserInfo(@RequestParam UserInfo userInfo){
        usersService.insertUser(userInfo);
    }
}
