package com.oaio.maven.acceptance.configuration;


import com.oaio.maven.acceptance.adapters.InMemoryProblemRepository;
import com.oaio.maven.acceptance.domain.ProblemRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class RepositoriesConfiguration {

    @Bean
    @Scope("cucumber-glue")
    public ProblemRepository problemRepository(){
        return new InMemoryProblemRepository();
    }
}
