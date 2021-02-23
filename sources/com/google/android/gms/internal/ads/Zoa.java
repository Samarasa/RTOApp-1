package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class Zoa {

    /* renamed from: a  reason: collision with root package name */
    private final String f9590a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9591b;

    public Zoa(String str, String str2) {
        this.f9590a = str;
        this.f9591b = str2;
    }

    public final String a() {
        return this.f9590a;
    }

    public final String b() {
        return this.f9591b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Zoa.class == obj.getClass()) {
            Zoa zoa = (Zoa) obj;
            return TextUtils.equals(this.f9590a, zoa.f9590a) && TextUtils.equals(this.f9591b, zoa.f9591b);
        }
    }

    public final int hashCode() {
        return (this.f9590a.hashCode() * 31) + this.f9591b.hashCode();
    }

    public final String toString() {
        String str = this.f9590a;
        String str2 = this.f9591b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
