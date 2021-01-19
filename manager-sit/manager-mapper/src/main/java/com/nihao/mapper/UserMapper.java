package com.nihao.mapper;

import com.nihao.pojo.Users;

import java.util.List;

/**
 * @author nihao
 * @time 2020/11/20
 */
public interface UserMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
