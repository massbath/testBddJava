package com.oaio.maven.acceptance.domain;

public class Solution {
    private final String content;
    private final Problem problem;

    public Solution(String content, Problem problem) {
        this.content = content;
        this.problem = problem;
    }

    public String getContent() {
        return content;
    }

    public Problem getProblem() {
        return problem;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "content='" + content + '\'' +
                ", problem=" + problem +
                '}';
    }
}
