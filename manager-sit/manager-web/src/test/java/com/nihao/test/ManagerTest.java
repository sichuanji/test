package com.nihao.test;

import com.nihao.mapper.UserMapper;
import com.nihao.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author nihao
 * @time 2020/11/21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setUserage(13);
        users.setUsername("xiuer");
        this.userMapper.insertUser(users);
    }

}
