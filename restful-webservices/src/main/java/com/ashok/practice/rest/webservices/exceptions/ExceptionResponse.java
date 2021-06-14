package com.ashok.practice.rest.webservices.exceptions;

import java.util.Date;

public class ExceptionResponse {
    private String message;
    private Date timeStamp;
    private String details;

    public ExceptionResponse(String message, Date timeStamp, String details) {
        this.message = message;
        this.timeStamp = timeStamp;
        this.details = details;
    }

    public ExceptionResponse(){
        //default constructor
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
