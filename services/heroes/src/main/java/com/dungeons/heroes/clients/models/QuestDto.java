package com.dungeons.heroes.clients.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuestDto {
    String name;
    Double reward;
    Boolean isDone;
}
