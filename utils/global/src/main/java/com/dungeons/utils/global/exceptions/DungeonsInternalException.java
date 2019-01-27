package com.dungeons.utils.global.exceptions;

import com.dungeons.utils.global.exceptions.errors.DungeonError;

import java.util.List;

public class DungeonsInternalException extends DungeonsException{
    public DungeonsInternalException(String s, List<DungeonError> errors) {
        super(s, errors);
    }
}
