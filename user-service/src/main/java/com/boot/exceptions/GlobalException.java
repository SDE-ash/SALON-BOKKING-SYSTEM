package com.boot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalException {

    //defining 404 NOT FOUND
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFound( ResourceNotFoundException ex){
        ErrorResponse errorBody = ErrorResponse.builder()
                .status(HttpStatus.NOT_FOUND.value())
                .message(ex.getMessage())
                .timstamp(LocalDateTime.now().withNano(0))
                .build();
        return new ResponseEntity<>(errorBody, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(UserNotSavedException.class)
    public ResponseEntity<ErrorResponse> handleUserNotSavedException( UserNotSavedException ex){
        return new ResponseEntity<ErrorResponse>(ErrorResponse.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .message(ex.getMessage()).timstamp(LocalDateTime.now().withNano(0))
                .build(), HttpStatus.BAD_REQUEST);        
    }
}
