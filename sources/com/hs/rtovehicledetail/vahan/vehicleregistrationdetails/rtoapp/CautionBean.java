package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

public class CautionBean {
    private String image;
    private String state;

    public CautionBean() {
    }

    public CautionBean(String str, String str2) {
        this.state = str;
        this.image = str2;
    }

    public String getImage() {
        return this.image;
    }

    public String getState() {
        return this.state;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setState(String str) {
        this.state = str;
    }
}
