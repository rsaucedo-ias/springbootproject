package com.example.springbootproject.exception;

public class ServiceException extends Exception{
    public ServiceException(String errorMessage){
        super(errorMessage);
    }
}
