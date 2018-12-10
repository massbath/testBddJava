package com.oaio.maven.acceptance.domain;

public class Problem {
    private final String description;

    public Problem(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "description='" + description + '\'' +
                '}';
    }
}
