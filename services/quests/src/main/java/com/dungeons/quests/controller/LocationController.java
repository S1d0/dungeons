package com.dungeons.quests.controller;

import com.dungeons.quests.model.LocationInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

    @GetMapping
    public LocationInfo info(Long locationId){
        return  null;
    }

}
