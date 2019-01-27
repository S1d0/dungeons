package com.dungeons.quests.controller;

import com.dungeons.quests.model.Quest;
import com.dungeons.quests.service.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quests")
public class QuestController {
    private QuestService questService;

    @Autowired
    public QuestController(QuestService questService) {
        this.questService = questService;
    }

    @GetMapping("/{heroId}")
    private List<Quest> getAllQuests(@PathVariable Long heroId) {
        return questService.getAllQuests(heroId);
    }
}
