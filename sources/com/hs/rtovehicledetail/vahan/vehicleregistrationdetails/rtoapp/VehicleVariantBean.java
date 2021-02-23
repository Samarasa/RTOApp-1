package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

public class VehicleVariantBean {
    private String brand_id;
    private String model_id;
    private String variant_bspace;
    private String variant_features;
    private String variant_fuel;
    private String variant_hp;
    private String variant_id;
    private String variant_milage;
    private String variant_name;
    private String variant_price;
    private String vh_type;

    public VehicleVariantBean() {
    }

    public VehicleVariantBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.variant_name = str;
        this.variant_id = str2;
        this.model_id = str3;
        this.brand_id = str4;
        this.variant_price = str5;
        this.variant_hp = str6;
        this.variant_milage = str7;
        this.variant_fuel = str8;
        this.variant_features = str9;
        this.variant_bspace = str10;
        this.vh_type = str11;
    }

    public String getBrand_id() {
        return this.brand_id;
    }

    public String getModel_id() {
        return this.model_id;
    }

    public String getVariant_bspace() {
        return this.variant_bspace;
    }

    public String getVariant_features() {
        return this.variant_features;
    }

    public String getVariant_fuel() {
        return this.variant_fuel;
    }

    public String getVariant_hp() {
        return this.variant_hp;
    }

    public String getVariant_id() {
        return this.variant_id;
    }

    public String getVariant_milage() {
        return this.variant_milage;
    }

    public String getVariant_name() {
        return this.variant_name;
    }

    public String getVariant_price() {
        return this.variant_price;
    }

    public String getVh_type() {
        return this.vh_type;
    }

    public void setBrand_id(String str) {
        this.brand_id = str;
    }

    public void setModel_id(String str) {
        this.model_id = str;
    }

    public void setVariant_bspace(String str) {
        this.variant_bspace = str;
    }

    public void setVariant_features(String str) {
        this.variant_features = str;
    }

    public void setVariant_fuel(String str) {
        this.variant_fuel = str;
    }

    public void setVariant_hp(String str) {
        this.variant_hp = str;
    }

    public void setVariant_id(String str) {
        this.variant_id = str;
    }

    public void setVariant_milage(String str) {
        this.variant_milage = str;
    }

    public void setVariant_name(String str) {
        this.variant_name = str;
    }

    public void setVariant_price(String str) {
        this.variant_price = str;
    }

    public void setVh_type(String str) {
        this.vh_type = str;
    }

    public String toString() {
        return "VehicleVariantBean{variant_name='" + this.variant_name + '\'' + ", variant_id='" + this.variant_id + '\'' + ", model_id='" + this.model_id + '\'' + ", brand_id='" + this.brand_id + '\'' + ", variant_price='" + this.variant_price + '\'' + ", variant_hp='" + this.variant_hp + '\'' + ", variant_milage='" + this.variant_milage + '\'' + ", variant_fuel='" + this.variant_fuel + '\'' + ", variant_features='" + this.variant_features + '\'' + ", variant_bspace='" + this.variant_bspace + '\'' + ", vh_type='" + this.vh_type + '\'' + '}';
    }
}
