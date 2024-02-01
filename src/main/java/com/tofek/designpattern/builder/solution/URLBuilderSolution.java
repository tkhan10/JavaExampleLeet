package com.tofek.designpattern.builder.solution;

public class URLBuilderSolution {

    private String protocol;
    private String hostname;
    private String port; // Optional
    private String pathParam; // Optional
    private String queryParam; // Optional

    @Override
    public String toString() {
        return "URLBuilderProblem{" +
                "protocol='" + protocol + '\'' +
                ", hostname='" + hostname + '\'' +
                ", port='" + port + '\'' +
                ", pathParam='" + pathParam + '\'' +
                ", queryParam='" + queryParam + '\'' +
                '}';
    }
}
