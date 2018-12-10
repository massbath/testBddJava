package com.oaio.maven.acceptance.domain;

import java.util.Optional;

public interface ProblemRepository {
    void add(Problem problem);

    Optional<Problem> find(String problemDescription);
}
