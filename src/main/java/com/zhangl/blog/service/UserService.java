package com.zhangl.blog.service;

import com.zhangl.blog.vo.User;

public interface UserService {
    boolean addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User queryUserById(int id);

    User queryUserByName(String name);
}
