package com.dungeons.utils.global;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


@JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        creatorVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public interface DungeonsSerialization {
}
