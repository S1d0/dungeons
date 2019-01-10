package com.dungeons.heroes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HeroesController {

    @GetMapping
    public String hello(){
        return "Hello Dungeons and dragons";
    }
}
