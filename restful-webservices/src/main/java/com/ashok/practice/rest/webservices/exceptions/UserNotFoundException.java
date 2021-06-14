package com.ashok.practice.rest.webservices.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends Exception {
    String message = null;

    public UserNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
