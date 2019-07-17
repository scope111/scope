package com.scope.BookManager.service;

import com.scope.BookManager.dao.TIcketDAO;
import com.scope.BookManager.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    @Autowired
    private TIcketDAO ticketDAO;
    public void addTicket(Ticket t){
        ticketDAO.addTicket(t);
    }
    public Ticket getTicket(int uid){
        return ticketDAO.selectByUserId(uid);
    }
    public Ticket getTicket(String t){
        return ticketDAO.selectByTicket(t);
    }
    public void deleteTicket(int tid){
        ticketDAO.deleteTicketById(tid);
    }
    public void deleteTicket(String t){
        ticketDAO.deleteTicket(t);
    }
}
