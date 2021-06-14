package com.ashok.practice.rest.webservices.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;


@RestController
@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) throws Exception {
        ExceptionResponse exResponse = new ExceptionResponse(ex.getMessage(),
                new Date(),
                request.getDescription(false));
        return new ResponseEntity(exResponse, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<Object> handleUserExceptions(UserNotFoundException ex, WebRequest request) throws Exception {
        ExceptionResponse exResponse = new ExceptionResponse(ex.getMessage(),
                new Date(),
                request.getDescription(false));
        return new ResponseEntity(exResponse, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(UserNotSupportedException.class)
    public final ResponseEntity<Object> handleUserExceptions(UserNotSupportedException ex, WebRequest request) throws Exception {
        ExceptionResponse exResponse = new ExceptionResponse(ex.getMessage(),
                new Date(),
                request.getDescription(false));
        return new ResponseEntity(exResponse, HttpStatus.NOT_ACCEPTABLE);

    }

    @Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ExceptionResponse exResponse = new ExceptionResponse("Validation failed",
                new Date(),
                ex.getBindingResult().toString());
        return new ResponseEntity(exResponse, HttpStatus.BAD_REQUEST);
    }
}
