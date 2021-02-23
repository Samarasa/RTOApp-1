package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

public class NewsBean {
    private String news_content;
    private String news_id;
    private String news_image;
    private String news_title;

    public NewsBean() {
    }

    public NewsBean(String str, String str2, String str3, String str4) {
        this.news_title = str;
        this.news_id = str2;
        this.news_image = str3;
        this.news_content = str4;
    }

    public String getNews_content() {
        return this.news_content;
    }

    public String getNews_id() {
        return this.news_id;
    }

    public String getNews_image() {
        return this.news_image;
    }

    public String getNews_title() {
        return this.news_title;
    }

    public void setNews_content(String str) {
        this.news_content = str;
    }

    public void setNews_id(String str) {
        this.news_id = str;
    }

    public void setNews_image(String str) {
        this.news_image = str;
    }

    public void setNews_title(String str) {
        this.news_title = str;
    }

    public String toString() {
        return "NewsBean{news_title='" + this.news_title + '\'' + ", news_id='" + this.news_id + '\'' + ", news_image='" + this.news_image + '\'' + ", news_content='" + this.news_content + '\'' + '}';
    }
}
