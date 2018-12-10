package com.oaio.maven.acceptance.configuration;


import cucumber.api.java8.En;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {RepositoriesConfiguration.class,WorldConfiguration.class})
public class ContextTestingConfiguration implements En {


}
