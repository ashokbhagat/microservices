package com.ashok.practice.rest.webservices.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class UserNotSupportedException extends Exception {
    String message = null;

    public UserNotSupportedException(String message) {
        super(message);
        this.message = message;
    }
}
