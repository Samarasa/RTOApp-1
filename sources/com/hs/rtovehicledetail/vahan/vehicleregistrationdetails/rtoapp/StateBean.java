package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

public class StateBean {
    private String state;

    public StateBean() {
    }

    public StateBean(String str) {
        this.state = str;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String str) {
        this.state = str;
    }

    public String toString() {
        return "StateBean{state='" + this.state + '\'' + '}';
    }
}
