package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.d.d.Ba;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.c;

public class z extends C3277b {
    public static final Parcelable.Creator<z> CREATOR = new H();

    /* renamed from: a  reason: collision with root package name */
    private String f14436a;

    /* renamed from: b  reason: collision with root package name */
    private String f14437b;

    z(String str, String str2) {
        C0563t.b(str);
        this.f14436a = str;
        C0563t.b(str2);
        this.f14437b = str2;
    }

    public static Ba a(z zVar, String str) {
        C0563t.a(zVar);
        return new Ba((String) null, zVar.f14436a, zVar.g(), (String) null, zVar.f14437b, (String) null, str, (String) null, (String) null);
    }

    public final C3277b a() {
        return new z(this.f14436a, this.f14437b);
    }

    public String g() {
        return "twitter.com";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f14436a, false);
        c.a(parcel, 2, this.f14437b, false);
        c.a(parcel, a2);
    }
}
