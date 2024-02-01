package com.tofek.designpattern.builder.problemstatement;

public class URLBuilderProblem {

    private String protocol;
    private String hostname;
    private String port; // Optional
    private String pathParam; // Optional
    private String queryParam; // Optional

     public URLBuilderProblem(String protocol, String hostname){
         this.protocol = protocol;
         this.hostname = hostname;
     }

    public URLBuilderProblem(String protocol, String hostname, String port){
        this.protocol = protocol;
        this.hostname = hostname;
        this.port = port;
    }

    public URLBuilderProblem(String protocol, String hostname, String port, String pathParam){
        this.protocol = protocol;
        this.hostname = hostname;
        this.port = port;
        this.pathParam = pathParam;
    }

    public URLBuilderProblem(String protocol, String hostname, String port, String pathParam, String queryParam){
        this.protocol = protocol;
        this.hostname = hostname;
        this.port = port;
        this.pathParam = pathParam;
        this.queryParam = queryParam;
    }
    /*
        I have made few combination of constructor that's possible
        There are so many combination that might be required.
     */

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
