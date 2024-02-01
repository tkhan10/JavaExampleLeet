package com.tofek.designpattern.builder.solution;

public class SolutionMainClass {

    public static void main(String[] args) {

        String protocol = "HTTPS";
        String hostname = "mywebsite";
        String port = "8080";
        String pathParam = "companies";
        String queryParam = "?companyName='abc'";
        /*
        Case 1 : need protocol, hostname, port
         */
        URLBuilder.Builder case1 = new URLBuilder.Builder();
        case1.protocol(protocol).hostname(hostname).port(port);
        case1.build();
        System.out.println(case1.protocol+"://"+case1.hostname+"/"+case1.port);

        /*
        Case 2 : Need protocol, hostname, pathParam;
        This case will be a problem because we don't have constructor with this combination.
        So need to pass null for other fields.
         */
        URLBuilder.Builder case2 = new URLBuilder.Builder();
        case2.protocol(protocol).hostname(hostname).pathParam(pathParam);
        case2.build();
        System.out.println(case2.protocol+"://"+case2.hostname+"/"+case2.pathParam);

        /*
        If we have any solution which will provide us object creation based on given fields.

         */

    }
}
