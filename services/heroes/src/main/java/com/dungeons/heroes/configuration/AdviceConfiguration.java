package com.dungeons.heroes.configuration;

import com.dungeons.utils.global.advice.GlobalAdvice;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = GlobalAdvice.class)
public class AdviceConfiguration {
}
