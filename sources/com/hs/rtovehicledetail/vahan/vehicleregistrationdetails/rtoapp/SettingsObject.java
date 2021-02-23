package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

public class SettingsObject {
    private String chasi_no;
    private String engine_no;
    private String fuel_type;
    private int index;
    private String maker_model;
    private String owner_name;
    private String reg_at;
    private String reg_date;
    private String reg_no;
    private String vehicle_class;

    public SettingsObject() {
    }

    public SettingsObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.reg_no = str;
        this.reg_at = str2;
        this.owner_name = str3;
        this.reg_date = str4;
        this.maker_model = str5;
        this.vehicle_class = str6;
        this.fuel_type = str7;
        this.chasi_no = str8;
        this.engine_no = str9;
    }

    public SettingsObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i) {
        this.reg_no = str;
        this.reg_at = str2;
        this.owner_name = str3;
        this.reg_date = str4;
        this.maker_model = str5;
        this.vehicle_class = str6;
        this.fuel_type = str7;
        this.chasi_no = str8;
        this.engine_no = str9;
        this.index = i;
    }

    public String getChasi_no() {
        return this.chasi_no;
    }

    public String getEngine_no() {
        return this.engine_no;
    }

    public String getFuel_type() {
        return this.fuel_type;
    }

    public int getIndex() {
        return this.index;
    }

    public String getMaker_model() {
        return this.maker_model;
    }

    public String getOwner_name() {
        return this.owner_name;
    }

    public String getReg_at() {
        return this.reg_at;
    }

    public String getReg_date() {
        return this.reg_date;
    }

    public String getReg_no() {
        return this.reg_no;
    }

    public String getVehicle_class() {
        return this.vehicle_class;
    }

    public void setChasi_no(String str) {
        this.chasi_no = str;
    }

    public void setEngine_no(String str) {
        this.engine_no = str;
    }

    public void setFuel_type(String str) {
        this.fuel_type = str;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setMaker_model(String str) {
        this.maker_model = str;
    }

    public void setOwner_name(String str) {
        this.owner_name = str;
    }

    public void setReg_at(String str) {
        this.reg_at = str;
    }

    public void setReg_date(String str) {
        this.reg_date = str;
    }

    public void setReg_no(String str) {
        this.reg_no = str;
    }

    public void setVehicle_class(String str) {
        this.vehicle_class = str;
    }
}
