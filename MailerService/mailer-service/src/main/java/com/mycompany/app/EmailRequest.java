package com.mycompany.app;


public class EmailRequest {
    private String to;
    private String subject;
    private String body;

    public String getTo(){
        return to;
    }
    public String getBody(){
        return body;
    }
    public String getSubject(){
        return subject;
    }
}