package com.oaio.maven.acceptance;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:reportFeatures"}, features = {"src/test/resources"})
public class ProblemResolverApplicationBddTest {

}
