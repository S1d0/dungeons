package com.dungeons.heroes.configuration;

import com.dungeons.utils.global.feign.FeignErrorDecoder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = FeignErrorDecoder.class)
public class FeignConfiguration {
}
