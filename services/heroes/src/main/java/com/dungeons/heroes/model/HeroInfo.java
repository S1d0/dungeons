package com.dungeons.heroes.model;

import com.dungeons.heroes.clients.models.QuestDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
// No Args constructor is needed for Jackson Deserialization
@NoArgsConstructor
@Data
public class HeroInfo {
    String name;
    HeroClass heroClass;
    int lvl;
    List<QuestDto> questDto;

    public enum HeroClass{
        Barbarian,
        Knight,
        Mag
    }

}
