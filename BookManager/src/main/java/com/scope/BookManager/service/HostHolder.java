package com.scope.BookManager.service;



import com.scope.BookManager.model.User;
import com.scope.BookManager.utils.ConcurrentUtils;
import org.springframework.stereotype.Service;
@Service
public class HostHolder {
    public User getUser()
    {
        return ConcurrentUtils.getHost();
    }
    public void setUser(User user)
    {
        ConcurrentUtils.setHost(user);
    }
}
