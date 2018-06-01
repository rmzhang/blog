package com.zhangl.blog.dao;

import com.zhangl.blog.vo.User;

public interface UserDao {

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User queryUserById(int id);

    User queryUserByName(String name);

}
