package com.scope.BookManager.controllers;

import com.scope.BookManager.biz.LoginBiz;
import com.scope.BookManager.model.User;
import com.scope.BookManager.service.UserService;
import com.scope.BookManager.utils.CookieUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
    @Autowired
    private LoginBiz loginBiz;
    @Autowired
    private UserService userService;
    @RequestMapping(path = {"/books/register"},method = {RequestMethod.GET})
    public String register()
    {
        return "login/reister";
    }
@RequestMapping(path = {"/books/register/do"},method = {RequestMethod.GET})
    public String doregister(Model model, HttpServletResponse response, @RequestParam("name") String name,
                             @RequestParam("email") String email,@RequestParam("password") String password)
{
User user=new User();
user.setName(name);
    user.setEmail(email);
    user.setPassword(password);
   try {
String t=loginBiz.register(user);
       CookieUtils.writeCookie("t", t, response);
       return "rediret:/index";
    }
    catch (Exception e)
    {
        model.addAttribute("error",e.getMessage());
        return "404";
    }
}
    @RequestMapping(path = {"/books/logout/do"}, method = {RequestMethod.GET})
    public String doLogout(
            @CookieValue("t") String t
    ) {
        loginBiz.logout(t);
        return "redirect:/index";
    }
}
