package com.oaio.maven.acceptance.domain;

import java.util.Collection;

public interface SolutionRepository {
    void add(Solution solution);

    Collection<Solution> findSolutionsByProblem(Problem currentProblem);
}
