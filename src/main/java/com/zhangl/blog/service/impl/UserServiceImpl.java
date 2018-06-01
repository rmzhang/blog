package com.zhangl.blog.service.impl;

import com.zhangl.blog.dao.UserDao;
import com.zhangl.blog.service.UserService;
import com.zhangl.blog.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public boolean addUser(User user){
        boolean flag=false;
        try {
            userDao.addUser(user);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public User queryUserById(int id) {
        return null;
    }

    @Override
    public User queryUserByName(String name) {
        return null;
    }
}
