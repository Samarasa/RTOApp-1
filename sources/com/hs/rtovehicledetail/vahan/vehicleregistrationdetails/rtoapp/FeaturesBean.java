package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

public class FeaturesBean {
    private String feature_head;
    private String feature_name;
    private String feature_val;

    public FeaturesBean() {
    }

    public FeaturesBean(String str, String str2, String str3) {
        this.feature_head = str;
        this.feature_name = str2;
        this.feature_val = str3;
    }

    public String getFeature_head() {
        return this.feature_head;
    }

    public String getFeature_name() {
        return this.feature_name;
    }

    public String getFeature_val() {
        return this.feature_val;
    }

    public void setFeature_head(String str) {
        this.feature_head = str;
    }

    public void setFeature_name(String str) {
        this.feature_name = str;
    }

    public void setFeature_val(String str) {
        this.feature_val = str;
    }
}
