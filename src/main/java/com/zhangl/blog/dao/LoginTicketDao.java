package com.zhangl.blog.dao;

import com.zhangl.blog.vo.LoginTicket;

public interface LoginTicketDao {

    void insertLoginTicket(LoginTicket loginTicket);

    void updateStatus(String ticket,int status);

    void queryById(int id);

    void queryByTicket(String ticket);
}
