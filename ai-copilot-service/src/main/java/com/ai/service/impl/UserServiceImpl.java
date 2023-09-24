package com.ai.service.impl;

import com.ai.mapper.UserMapper;
import com.ai.model.User;
import com.ai.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author minghui.y
 * @create 2023-09-24 1:14 下午
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public User queryUserById( Long id ) {
        return userMapper.selectByPrimaryKey( id.intValue() );
    }
}
