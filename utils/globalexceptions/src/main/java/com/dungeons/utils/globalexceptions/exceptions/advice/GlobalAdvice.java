package com.dungeons.utils.globalexceptions.exceptions.advice;

import com.dungeons.utils.globalexceptions.exceptions.AbstractError;
import com.dungeons.utils.globalexceptions.exceptions.DungeonsNotFindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalAdvice {

    @ExceptionHandler(DungeonsNotFindException.class)
    public AbstractError handle(DungeonsNotFindException ex) {
        return ex;
    }
}
