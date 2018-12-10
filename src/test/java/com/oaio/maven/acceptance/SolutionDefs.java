package com.oaio.maven.acceptance;

import cucumber.api.PendingException;
import cucumber.api.java8.En;


public class SolutionDefs implements En {


    public SolutionDefs() {


            Given("^solution \"([^\"]*)\" for the problem exists$" ,(String solutionContent)->{
                // Write code here that turns the phrase above into concrete actions
                throw new PendingException();
            });

            When("^a ask for a solution for the problem \"([^\"]*)\"$",(String problemDescription)->
            {
                // Write code here that turns the phrase above into concrete actions
                throw new PendingException();
            });

            Then("^i should get the solution \"([^\"]*)\"$",(String solutionContent)->
            {
                // Write code here that turns the phrase above into concrete actions
                throw new PendingException();
            });
        }
    }

