package com.tofek.designpattern.builder.problemstatement;

public class problemStatementMainClass {

    public static void main(String[] args) {

        String protocol = "HTTPS";
        String hostname = "mywebsite";
        String port = "8080";
        String pathParam = "companies";
        String queryParam = "?companyName='abc'";
        /*
        Case 1 : need protocol, hostname, port
         */
        URLBuilderProblem case1 = new URLBuilderProblem(protocol, hostname, port);
        System.out.println(case1.toString());

        /*
        Case 2 : Need protocol, hostname, pathParam;
        This case will be a problem because we don't have constructor with this combination.
        So need to pass null for other fields.
         */
        URLBuilderProblem case2 = new URLBuilderProblem(protocol, hostname, null, pathParam);
        System.out.println(case2.toString());

        /*
        If we have any solution which will provide us object creation based on given fields.

         */

    }
}
