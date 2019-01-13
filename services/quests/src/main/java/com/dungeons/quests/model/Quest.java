package com.dungeons.quests.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Quest {
    String name;
    Double reward;
    Boolean isDone;
}
