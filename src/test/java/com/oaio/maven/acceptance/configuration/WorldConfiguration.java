package com.oaio.maven.acceptance.configuration;

import com.oaio.maven.acceptance.World;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorldConfiguration {
    @Bean
    public World getWorld(){
        return new World();
    }
}
