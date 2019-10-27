package com.caohangwei.mallvueserver.exception;

public class LoginException extends RuntimeException {

    public LoginException(){

    }

    public LoginException(String msg){
        super(msg);
    }
}
