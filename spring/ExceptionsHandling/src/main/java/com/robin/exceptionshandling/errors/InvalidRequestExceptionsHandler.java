package com.robin.exceptionshandling.errors;

import com.robin.exceptionshandling.User.errors.UserNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class InvalidRequestExceptionsHandler {

    public InvalidRequestExceptionsHandler() {
        System.out.println("exceptions advice is called");
    }
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> invalidRequestHandler(MethodArgumentNotValidException exc) {
        Map<String, String> errorMap = new HashMap<>();

        exc.getBindingResult().getFieldErrors().forEach(err -> {
            errorMap.put(err.getField(), err.getDefaultMessage());
        });


        return  ResponseEntity.badRequest().body(errorMap);
    }

    @ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<String> invalidRequestHandler(UserNotFoundException exc) {

        return  ResponseEntity.badRequest().body(exc.getMessage());
    }
}
