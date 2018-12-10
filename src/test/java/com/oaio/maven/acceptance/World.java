package com.oaio.maven.acceptance;

import com.oaio.maven.acceptance.domain.Problem;

public class World {
    private Problem currentProblem;

    public Problem getCurrentProblem() {
        return currentProblem;
    }

    public void setCurrentProblem(Problem currentProblem) {
        this.currentProblem = currentProblem;
    }
}
