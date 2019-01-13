package com.dungeons.heroes.clients;

import com.dungeons.heroes.clients.models.QuestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

// Name taken from bootstrap.yml of Quest service
@FeignClient(name = "quest-service")
@Component
public interface QuestClient {

    @GetMapping("/quests")
    List<QuestDto> getQuests();

}
