package com.dungeons.utils.global.exceptions.errors;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS)
@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class DungeonError {
    private String fallbackKey;

    public abstract String getReason();
    public abstract String getKey();
}
