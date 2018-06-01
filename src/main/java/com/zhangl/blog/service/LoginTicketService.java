package com.zhangl.blog.service;

import com.zhangl.blog.vo.LoginTicket;

public interface LoginTicketService {

    void insertLoginTicket(LoginTicket loginTicket);

    void updateStatus(String ticket,int status);

    void queryById(int id);

    void queryByTicket(String ticket);
}
