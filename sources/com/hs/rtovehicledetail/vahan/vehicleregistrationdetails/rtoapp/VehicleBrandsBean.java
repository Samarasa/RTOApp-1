package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

public class VehicleBrandsBean {
    private String brand_id;
    private String brand_image;
    private String brand_name;
    private String vehicle_type;

    public VehicleBrandsBean() {
    }

    public VehicleBrandsBean(String str, String str2, String str3, String str4) {
        this.brand_name = str;
        this.brand_id = str2;
        this.brand_image = str3;
        this.vehicle_type = str4;
    }

    public String getBrand_id() {
        return this.brand_id;
    }

    public String getBrand_image() {
        return this.brand_image;
    }

    public String getBrand_name() {
        return this.brand_name;
    }

    public String getVehicle_type() {
        return this.vehicle_type;
    }

    public void setBrand_id(String str) {
        this.brand_id = str;
    }

    public void setBrand_image(String str) {
        this.brand_image = str;
    }

    public void setBrand_name(String str) {
        this.brand_name = str;
    }

    public void setVehicle_type(String str) {
        this.vehicle_type = str;
    }

    public String toString() {
        return "VehicleBrandsBean{brand_name='" + this.brand_name + '\'' + ", brand_id='" + this.brand_id + '\'' + ", brand_image='" + this.brand_image + '\'' + ", vehicle_type='" + this.vehicle_type + '\'' + '}';
    }
}
