package com.dungeons.utils.global.advice;

import com.dungeons.utils.global.exceptions.DungeonsException;
import com.dungeons.utils.global.exceptions.DungeonsInternalException;
import com.dungeons.utils.global.exceptions.DungeonsNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalAdvice {
    @ExceptionHandler(DungeonsNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public DungeonsException handle(DungeonsNotFound ex){
        return ex;
    }

    @ExceptionHandler(DungeonsInternalException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public DungeonsInternalException handle(DungeonsInternalException ex) {
        return ex;
    }
}
