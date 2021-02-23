package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.d.d.Ba;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.c;

public class y extends C3277b {
    public static final Parcelable.Creator<y> CREATOR = new G();

    /* renamed from: a  reason: collision with root package name */
    private final String f14435a;

    y(String str) {
        C0563t.b(str);
        this.f14435a = str;
    }

    public static Ba a(y yVar, String str) {
        C0563t.a(yVar);
        return new Ba((String) null, (String) null, yVar.g(), (String) null, (String) null, yVar.f14435a, str, (String) null, (String) null);
    }

    public final C3277b a() {
        return new y(this.f14435a);
    }

    public String g() {
        return "playgames.google.com";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f14435a, false);
        c.a(parcel, a2);
    }
}
