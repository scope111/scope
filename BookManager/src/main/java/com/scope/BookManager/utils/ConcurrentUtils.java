package com.scope.BookManager.utils;

import com.scope.BookManager.model.User;

//保存当前访问者的容器
public class ConcurrentUtils {
   private  static ThreadLocal<User> host=new ThreadLocal<User>();
   public static User getHost()
   {
       return  host.get();
   }
    public static void setHost(User user){
        host.set(user);
    }

}
