package com.dungeons.quests.service;

import com.dungeons.quests.model.Quest;
import com.dungeons.utils.global.exceptions.DungeonsNotFound;
import com.dungeons.utils.global.exceptions.errors.DungeonFieldError;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class QuestService {

    public List<Quest> getAllQuests(Long heroId) {
        if (heroId > 2) {
            throw new DungeonsNotFound("ID NOT FOUND",
                    Collections.singletonList(new DungeonFieldError("hero.not.found", "error.id")));
        }
        return Arrays.asList(
                new Quest("Ubij smoka", 150.0, false),
                new Quest("Znajdź magiczne trzewiki Mietka", 100.0, true)
        );
    }
}
