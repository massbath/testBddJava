package com.oaio.maven.acceptance.adapters;

import com.oaio.maven.acceptance.domain.Problem;
import com.oaio.maven.acceptance.domain.ProblemRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryProblemRepository implements ProblemRepository {

    List<Problem> problems = new ArrayList<>();

    @Override
    public void add(Problem problem) {
        problems.add(problem);
    }

    @Override
    public Optional<Problem> find(String problemDescription) {
        return problems.stream().filter((Problem problem) -> problem.getDescription().equals(problemDescription)).findFirst();
    }
}
