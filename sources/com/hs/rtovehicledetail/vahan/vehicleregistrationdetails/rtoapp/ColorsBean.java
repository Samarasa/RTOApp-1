package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

public class ColorsBean {
    private String code_color;
    private String color_id;
    private String model_id;
    private String name_color;

    public ColorsBean() {
    }

    public ColorsBean(String str, String str2, String str3, String str4) {
        this.color_id = str;
        this.model_id = str2;
        this.name_color = str3;
        this.code_color = str4;
    }

    public String getCode_color() {
        return this.code_color;
    }

    public String getColor_id() {
        return this.color_id;
    }

    public String getModel_id() {
        return this.model_id;
    }

    public String getName_color() {
        return this.name_color;
    }

    public void setCode_color(String str) {
        this.code_color = str;
    }

    public void setColor_id(String str) {
        this.color_id = str;
    }

    public void setModel_id(String str) {
        this.model_id = str;
    }

    public void setName_color(String str) {
        this.name_color = str;
    }
}
