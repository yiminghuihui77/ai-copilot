package com.ai.controller;

import com.ai.model.User;
import com.ai.service.UserService;
import com.alibaba.fastjson2.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author minghui.y
 * @create 2023-09-24 1:59 下午
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("/queryUserById")
    public String queryUserById(Long userId) {
        User user = userService.queryUserById( userId );
        return JSON.toJSONString( user );
    }
}
