package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

public class VehicleModelsBean {
    private String brand_id;
    private String model_fuel;
    private String model_hp;
    private String model_id;
    private String model_image;
    private String model_milage;
    private String model_name;
    private String model_price;
    private String vh_type;

    public VehicleModelsBean() {
    }

    public VehicleModelsBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.model_name = str;
        this.model_id = str2;
        this.model_image = str3;
        this.brand_id = str4;
        this.model_price = str5;
        this.model_hp = str6;
        this.model_milage = str7;
        this.model_fuel = str8;
        this.vh_type = str9;
    }

    public String getBrand_id() {
        return this.brand_id;
    }

    public String getModel_fuel() {
        return this.model_fuel;
    }

    public String getModel_hp() {
        return this.model_hp;
    }

    public String getModel_id() {
        return this.model_id;
    }

    public String getModel_image() {
        return this.model_image;
    }

    public String getModel_milage() {
        return this.model_milage;
    }

    public String getModel_name() {
        return this.model_name;
    }

    public String getModel_price() {
        return this.model_price;
    }

    public String getVh_type() {
        return this.vh_type;
    }

    public void setBrand_id(String str) {
        this.brand_id = str;
    }

    public void setModel_fuel(String str) {
        this.model_fuel = str;
    }

    public void setModel_hp(String str) {
        this.model_hp = str;
    }

    public void setModel_id(String str) {
        this.model_id = str;
    }

    public void setModel_image(String str) {
        this.model_image = str;
    }

    public void setModel_milage(String str) {
        this.model_milage = str;
    }

    public void setModel_name(String str) {
        this.model_name = str;
    }

    public void setModel_price(String str) {
        this.model_price = str;
    }

    public void setVh_type(String str) {
        this.vh_type = str;
    }

    public String toString() {
        return "VehicleModelsBean{model_name='" + this.model_name + '\'' + ", model_id='" + this.model_id + '\'' + ", model_image='" + this.model_image + '\'' + ", brand_id='" + this.brand_id + '\'' + ", model_price='" + this.model_price + '\'' + ", model_hp='" + this.model_hp + '\'' + ", model_milage='" + this.model_milage + '\'' + ", model_fuel='" + this.model_fuel + '\'' + ", vh_type='" + this.vh_type + '\'' + '}';
    }
}
