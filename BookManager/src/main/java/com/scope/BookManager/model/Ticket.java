package com.scope.BookManager.model;

import java.util.Date;

public class Ticket {
    public   int id;
    //相绑定的user id
    public int userId;
    //t 票实体
    public   String ticket;
    //过期时间
    public Date expiredAt;
    public  int getId()
    {
        return  id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getTicket() {
        return ticket;
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
    public Date getExpiredAt() {
        return expiredAt;
    }
    public void setExpiredAt(Date expiredAt) {
        this.expiredAt = expiredAt;
    }
}
