package org.jsoup;

import java.io.IOException;

public class HttpStatusException extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private int f15374a;

    /* renamed from: b  reason: collision with root package name */
    private String f15375b;

    public HttpStatusException(String str, int i, String str2) {
        super(str);
        this.f15374a = i;
        this.f15375b = str2;
    }

    public int getStatusCode() {
        return this.f15374a;
    }

    public String getUrl() {
        return this.f15375b;
    }

    public String toString() {
        return super.toString() + ". Status=" + this.f15374a + ", URL=" + this.f15375b;
    }
}
