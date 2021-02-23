package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.d.d.Ba;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.c;

public class J extends C3310u {
    public static final Parcelable.Creator<J> CREATOR = new L();

    /* renamed from: a  reason: collision with root package name */
    private final String f14269a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14270b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14271c;

    /* renamed from: d  reason: collision with root package name */
    private final Ba f14272d;

    /* renamed from: e  reason: collision with root package name */
    private final String f14273e;

    /* renamed from: f  reason: collision with root package name */
    private final String f14274f;

    /* renamed from: g  reason: collision with root package name */
    private final String f14275g;

    J(String str, String str2, String str3, Ba ba, String str4, String str5, String str6) {
        this.f14269a = str;
        this.f14270b = str2;
        this.f14271c = str3;
        this.f14272d = ba;
        this.f14273e = str4;
        this.f14274f = str5;
        this.f14275g = str6;
    }

    public static Ba a(J j, String str) {
        C0563t.a(j);
        Ba ba = j.f14272d;
        if (ba != null) {
            return ba;
        }
        return new Ba(j.i(), j.h(), j.g(), (String) null, j.j(), (String) null, str, j.f14273e, j.f14275g);
    }

    public static J a(Ba ba) {
        C0563t.a(ba, (Object) "Must specify a non-null webSignInCredential");
        return new J((String) null, (String) null, (String) null, ba, (String) null, (String) null, (String) null);
    }

    public final C3277b a() {
        return new J(this.f14269a, this.f14270b, this.f14271c, this.f14272d, this.f14273e, this.f14274f, this.f14275g);
    }

    public String g() {
        return this.f14269a;
    }

    public String h() {
        return this.f14271c;
    }

    public String i() {
        return this.f14270b;
    }

    public String j() {
        return this.f14274f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, g(), false);
        c.a(parcel, 2, i(), false);
        c.a(parcel, 3, h(), false);
        c.a(parcel, 4, (Parcelable) this.f14272d, i, false);
        c.a(parcel, 5, this.f14273e, false);
        c.a(parcel, 6, j(), false);
        c.a(parcel, 7, this.f14275g, false);
        c.a(parcel, a2);
    }
}
