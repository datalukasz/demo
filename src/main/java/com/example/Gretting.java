package com.example;

/**
 * Created by ldata on 7/4/2016.
 */
public class Gretting {

    long id;
    String content;


    public Gretting() {
        this.id =1;
        this.content = "";
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(long id) {

        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}