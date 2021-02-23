package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

public class DLTestBean {
    private String qAnswer;
    int qID;
    private String qImg;
    private String qOptionOne;
    private String qOptionThree;
    private String qOptionTwo;
    private String qQuestion;
    private String uAnswer;

    public DLTestBean() {
    }

    public DLTestBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        this.qImg = str;
        this.qQuestion = str2;
        this.qOptionOne = str3;
        this.qOptionTwo = str4;
        this.qOptionThree = str5;
        this.qAnswer = str6;
        this.uAnswer = str7;
        this.qID = i;
    }

    public String getqAnswer() {
        return this.qAnswer;
    }

    public int getqID() {
        return this.qID;
    }

    public String getqImg() {
        return this.qImg;
    }

    public String getqOptionOne() {
        return this.qOptionOne;
    }

    public String getqOptionThree() {
        return this.qOptionThree;
    }

    public String getqOptionTwo() {
        return this.qOptionTwo;
    }

    public String getqQuestion() {
        return this.qQuestion;
    }

    public String getuAnswer() {
        return this.uAnswer;
    }

    public void setqAnswer(String str) {
        this.qAnswer = str;
    }

    public void setqID(int i) {
        this.qID = i;
    }

    public void setqImg(String str) {
        this.qImg = str;
    }

    public void setqOptionOne(String str) {
        this.qOptionOne = str;
    }

    public void setqOptionThree(String str) {
        this.qOptionThree = str;
    }

    public void setqOptionTwo(String str) {
        this.qOptionTwo = str;
    }

    public void setqQuestion(String str) {
        this.qQuestion = str;
    }

    public void setuAnswer(String str) {
        this.uAnswer = str;
    }
}
