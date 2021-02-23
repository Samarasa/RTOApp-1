package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

public class ImageModel {
    private String imgLinkUrl;
    private String imgUrl;

    public ImageModel(String str, String str2) {
        this.imgUrl = str;
        this.imgLinkUrl = str2;
    }

    public String getImgLinkUrl() {
        return this.imgLinkUrl;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgLinkUrl(String str) {
        this.imgLinkUrl = str;
    }

    public void setImgUrl(String str) {
        this.imgUrl = str;
    }
}
