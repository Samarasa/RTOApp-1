package org.jsoup;

import java.io.IOException;

public class UnsupportedMimeTypeException extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private String f15376a;

    /* renamed from: b  reason: collision with root package name */
    private String f15377b;

    public UnsupportedMimeTypeException(String str, String str2, String str3) {
        super(str);
        this.f15376a = str2;
        this.f15377b = str3;
    }

    public String getMimeType() {
        return this.f15376a;
    }

    public String getUrl() {
        return this.f15377b;
    }

    public String toString() {
        return super.toString() + ". Mimetype=" + this.f15376a + ", URL=" + this.f15377b;
    }
}
