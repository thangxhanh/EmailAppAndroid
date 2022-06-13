package com.example.emailapp;

public class EmailModel {
    private int thumb;
    private String title;
    private String content;
    private String time;
    private int star;

    public EmailModel(int thumb, String title, String content, String time, int star) {
        this.thumb = thumb;
        this.title = title;
        this.content = content;
        this.time = time;
        this.star = star;
    }

    public int getThumb() {
        return thumb;
    }

    public void setThumb(int thumb) {
        this.thumb = thumb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }
}
