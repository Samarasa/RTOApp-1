package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.d.d.Ba;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.firebase.auth.s  reason: case insensitive filesystem */
public class C3308s extends C3277b {
    public static final Parcelable.Creator<C3308s> CREATOR = new U();

    /* renamed from: a  reason: collision with root package name */
    private String f14424a;

    C3308s(String str) {
        C0563t.b(str);
        this.f14424a = str;
    }

    public static Ba a(C3308s sVar, String str) {
        C0563t.a(sVar);
        return new Ba((String) null, sVar.f14424a, sVar.g(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    public final C3277b a() {
        return new C3308s(this.f14424a);
    }

    public String g() {
        return "github.com";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f14424a, false);
        c.a(parcel, a2);
    }
}
