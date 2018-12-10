package com.oaio.maven.acceptance;

import com.oaio.maven.acceptance.domain.Solution;
import com.oaio.maven.acceptance.domain.SolutionRepository;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.util.Collection;


public class SolutionSteps implements En {


    public SolutionSteps(SolutionRepository solutionRepository, World world) {


            Given("^solution \"([^\"]*)\" for the problem exists$" ,(String solutionContent)->{
                Solution solution = new Solution(solutionContent, world.getCurrentProblem());
                solutionRepository.add(solution);
                Collection<Solution> solutions = solutionRepository
                        .findSolutionsByProblem(world.getCurrentProblem());

                Assert.assertFalse(solutions.isEmpty());
                MatcherAssert.assertThat(solutions, Matchers.hasItem(solution));


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

