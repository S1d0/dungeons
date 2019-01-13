package com.dungeons.heroes.controller;

import com.dungeons.heroes.clients.QuestClient;
import com.dungeons.heroes.clients.models.QuestDto;
import com.dungeons.heroes.model.HeroInfo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping
    public String hello(){
        return "Hello in Dungeons and dragons";
    }

    @GetMapping("/heroInfo")
    public HeroInfo getHeroInfo() {
        List<QuestDto> questDtos = questClient.getQuests();
        return new HeroInfo("Mietek Łoprawca", HeroInfo.HeroClass.Barbarian, 1, questDtos);
    }
}
