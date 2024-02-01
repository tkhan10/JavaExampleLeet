package com.tofek.designpattern.builder.solution;

public class URLBuilder {

    public static class Builder{
        String protocol;
        String hostname;
        String port; // Optional
        String pathParam; // Optional
        private String queryParam; // Optional

        public URLBuilder build(){
            return new URLBuilder(this);
        }

        public Builder protocol(String protocol){
            this.protocol = protocol;
            return this;
        }

        public Builder hostname(String hostname){
            this.hostname = hostname;
            return this;
        }

        public Builder port(String port){
            this.port = port;
            return this;
        }

        public Builder pathParam(String pathParam){
            this.pathParam = pathParam;
            return this;
        }

        public Builder queryParam(String queryParam){
            this.queryParam = queryParam;
            return this;
        }

    }

    private String protocol;
    private String hostname;
    private String port; // Optional
    private String pathParam; // Optional
    private String queryParam; // Optional

    private  URLBuilder(Builder builder){
        this.protocol = builder.protocol;
        this.hostname = builder.hostname;
        this.port = builder.port;
        this.pathParam = builder.pathParam;;
        this.queryParam = builder.queryParam;
    }

    @Override
    public String toString() {
        return "URLBuilder{" +
                "protocol='" + protocol + '\'' +
                ", hostname='" + hostname + '\'' +
                ", port='" + port + '\'' +
                ", pathParam='" + pathParam + '\'' +
                ", queryParam='" + queryParam + '\'' +
                '}';
    }
}

