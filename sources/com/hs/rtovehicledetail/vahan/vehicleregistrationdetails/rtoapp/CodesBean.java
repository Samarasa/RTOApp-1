package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

public class CodesBean {
    private String rtoAdd;
    private String rtoCode;
    private String rtoName;
    private String rtoPhone;
    private String rtoPin;

    public CodesBean() {
    }

    public CodesBean(String str, String str2, String str3, String str4, String str5) {
        this.rtoCode = str;
        this.rtoName = str2;
        this.rtoAdd = str3;
        this.rtoPin = str4;
        this.rtoPhone = str5;
    }

    public String getRtoAdd() {
        return this.rtoAdd;
    }

    public String getRtoCode() {
        return this.rtoCode;
    }

    public String getRtoName() {
        return this.rtoName;
    }

    public String getRtoPhone() {
        return this.rtoPhone;
    }

    public String getRtoPin() {
        return this.rtoPin;
    }

    public void setRtoAdd(String str) {
        this.rtoAdd = str;
    }

    public void setRtoCode(String str) {
        this.rtoCode = str;
    }

    public void setRtoName(String str) {
        this.rtoName = str;
    }

    public void setRtoPhone(String str) {
        this.rtoPhone = str;
    }

    public void setRtoPin(String str) {
        this.rtoPin = str;
    }
}
