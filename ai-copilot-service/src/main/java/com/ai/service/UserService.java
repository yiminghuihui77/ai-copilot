package com.ai.service;

import com.ai.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author minghui.y
 * @create 2023-09-24 1:13 下午
 **/
public interface UserService {

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User queryUserById(Long id);
}
