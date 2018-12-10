package com.oaio.maven.acceptance.adapters;

import com.oaio.maven.acceptance.domain.Problem;
import com.oaio.maven.acceptance.domain.Solution;
import com.oaio.maven.acceptance.domain.SolutionRepository;

import java.util.*;

public class InMemorySolutionRepository implements SolutionRepository {

    private Map<Problem, List<Solution>> solutions = new HashMap<>();

    @Override
    public void add(Solution solution) {
        if(!solutions.containsKey(solution.getProblem())){
            solutions.put(solution.getProblem(), new ArrayList<>());
        }
        solutions.get(solution.getProblem()).add(solution);
    }

    @Override
    public Collection<Solution> findSolutionsByProblem(Problem problem) {
        return solutions.containsKey(problem)?solutions.get(problem):new ArrayList<>();
    }
}
