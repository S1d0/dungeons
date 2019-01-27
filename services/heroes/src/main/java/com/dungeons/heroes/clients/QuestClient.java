package com.dungeons.heroes.clients;

import com.dungeons.heroes.clients.models.QuestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Name taken from bootstrap.yml of Quest service
@FeignClient(name = "quest-service")
@RestController
public interface QuestClient {

    @GetMapping("quests/{heroId}")
    List<QuestDto> getQuests(@PathVariable(value = "heroId") Long heroId);
}
