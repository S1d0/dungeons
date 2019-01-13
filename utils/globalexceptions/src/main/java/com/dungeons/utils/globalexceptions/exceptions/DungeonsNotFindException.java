package com.dungeons.utils.globalexceptions.exceptions;

import com.dungeons.utils.globalexceptions.exceptions.error.ErrorInfo;

import java.util.List;

public class DungeonsNotFindException extends AbstractError {

    public DungeonsNotFindException(String message, List<ErrorInfo> errorInfos) {
        super(message, errorInfos);
    }
}
