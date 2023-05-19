package com.robin.exceptionshandling.User.errors;

public class UserNotFoundException extends RuntimeException{
    public  UserNotFoundException(String msg) {
        super(msg);
    }
}
