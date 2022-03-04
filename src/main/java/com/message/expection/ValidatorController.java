package com.message.expection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class ValidatorController {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> constraintExceptionHandler(ConstraintViolationException exception){
        return ResponseEntity.badRequest().body(exception.getConstraintViolations().iterator().next().getMessage());
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> constraintExceptionHandler(MethodArgumentNotValidException exception){
        return ResponseEntity.badRequest().body(exception.getFieldErrors().iterator().next().getDefaultMessage());
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception exception){
        return new ResponseEntity<>("error occured", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
