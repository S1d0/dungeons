package com.dungeons.quests.controller;

import com.dungeons.quests.model.Quest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/quests")
public class QuestController {

    @GetMapping
    private List<Quest> getAllQuests(Long heroId){
        // MOCK
        return Arrays.asList(
                new Quest("Ubij smoka", 150.0, false),
                new Quest("Znajdz magiczny rów", 100.0, true)
        );
    }
}
