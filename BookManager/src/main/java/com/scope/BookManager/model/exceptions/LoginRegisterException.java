package com.scope.BookManager.model.exceptions;
// 注册和登录时的异常
public class LoginRegisterException  extends RuntimeException{
    public LoginRegisterException()
    {
        super();
    }
    public LoginRegisterException(String message) {
        super(message);
    }
    public LoginRegisterException(String message, Throwable cause) {
        super(message, cause);
    }
    public LoginRegisterException(Throwable cause) {
        super(cause);
    }
}
