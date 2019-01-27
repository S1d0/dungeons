package com.dungeons.utils.global.exceptions;

import com.dungeons.utils.global.DungeonsSerialization;
import com.dungeons.utils.global.exceptions.errors.DungeonError;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS)
@NoArgsConstructor
@Data
public abstract class DungeonsException extends RuntimeException implements DungeonsSerialization {
    @JsonProperty("errors")
    private List<DungeonError> errors;

    public DungeonsException(String s, List<DungeonError> errors) {
        super(s);
        this.errors = errors;
    }
}
