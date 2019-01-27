package com.dungeons.utils.global.exceptions;

import com.dungeons.utils.global.exceptions.errors.DungeonError;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class DungeonsNotFound extends DungeonsException{
    public DungeonsNotFound(String s, List<DungeonError> errors) {
        super(s, errors);
    }
}
