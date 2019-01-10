package com.dungeons.quests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class QuestsApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestsApplication.class, args);
    }

}

