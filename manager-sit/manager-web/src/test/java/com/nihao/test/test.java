package com.nihao.test;

import com.nihao.mapper.UserMapper;
import com.nihao.pojo.Users;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author nihao
 * @time 2020/11/21
 */
public class test {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void insertUserTest() {
        Users users = new Users();
        users.setUserage(13);
        users.setUsername("xiuer");
        this.userMapper.insertUser(null);
    }
}
