package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

public class ChallanBean {
    private String challanAmount;
    private String challanDate;
    private String challanNo;
    private String challanPaymentDate;
    private String challanStatus;

    public ChallanBean(String str, String str2, String str3, String str4, String str5) {
        this.challanNo = str;
        this.challanAmount = str2;
        this.challanStatus = str3;
        this.challanDate = str4;
        this.challanPaymentDate = str5;
    }

    public String getChallanAmount() {
        return this.challanAmount;
    }

    public String getChallanDate() {
        return this.challanDate;
    }

    public String getChallanNo() {
        return this.challanNo;
    }

    public String getChallanPaymentDate() {
        return this.challanPaymentDate;
    }

    public String getChallanStatus() {
        return this.challanStatus;
    }

    public void setChallanAmount(String str) {
        this.challanAmount = str;
    }

    public void setChallanDate(String str) {
        this.challanDate = str;
    }

    public void setChallanNo(String str) {
        this.challanNo = str;
    }

    public void setChallanPaymentDate(String str) {
        this.challanPaymentDate = str;
    }

    public void setChallanStatus(String str) {
        this.challanStatus = str;
    }
}
