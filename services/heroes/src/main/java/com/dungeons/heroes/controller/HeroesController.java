package com.dungeons.heroes.controller;

import com.dungeons.heroes.clients.QuestClient;
import com.dungeons.heroes.clients.models.QuestDto;
import com.dungeons.heroes.model.HeroInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HeroesController {
    private QuestClient questClient;

    @Autowired
    public HeroesController(QuestClient questClient) {
        this.questClient = questClient;
    }

    @GetMapping("/heroInfo/{heroId}")
    public HeroInfo getHeroInfo(@PathVariable Long heroId) {
        List<QuestDto> questDtos = questClient.getQuests(heroId);
        return new HeroInfo("Mietek Łoprawca", HeroInfo.HeroClass.Barbarian, 0, questDtos);
    }
}
