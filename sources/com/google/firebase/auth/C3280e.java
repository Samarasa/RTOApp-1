package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.d.d.Ba;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.firebase.auth.e  reason: case insensitive filesystem */
public class C3280e extends C3277b {
    public static final Parcelable.Creator<C3280e> CREATOR = new N();

    /* renamed from: a  reason: collision with root package name */
    private final String f14342a;

    C3280e(String str) {
        C0563t.b(str);
        this.f14342a = str;
    }

    public static Ba a(C3280e eVar, String str) {
        C0563t.a(eVar);
        return new Ba((String) null, eVar.f14342a, eVar.g(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    public final C3277b a() {
        return new C3280e(this.f14342a);
    }

    public String g() {
        return "facebook.com";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f14342a, false);
        c.a(parcel, a2);
    }
}
