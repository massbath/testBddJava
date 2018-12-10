package com.oaio.maven.acceptance;

import com.oaio.maven.acceptance.domain.Problem;
import com.oaio.maven.acceptance.domain.ProblemRepository;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.junit.Assert;

public class ProblemSteps implements En {

    public ProblemSteps(ProblemRepository problemRepository, World world) {
        Given("^problem \"([^\"]*)\" exist$",(String problemDescription)->{
            Problem problem = new Problem(problemDescription);
            problemRepository.add(problem);


            Assert.assertTrue(problemRepository.find(problemDescription).isPresent());
            Assert.assertEquals(problem,problemRepository.find(problemDescription).get());
            world.setCurrentProblem(problem);

        });


    }

}
