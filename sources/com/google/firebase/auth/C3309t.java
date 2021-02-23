package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.b.b.b.d.d.Ba;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.firebase.auth.t  reason: case insensitive filesystem */
public class C3309t extends C3277b {
    public static final Parcelable.Creator<C3309t> CREATOR = new V();

    /* renamed from: a  reason: collision with root package name */
    private final String f14425a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14426b;

    C3309t(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        a(str, "idToken");
        this.f14425a = str;
        a(str2, "accessToken");
        this.f14426b = str2;
    }

    public static Ba a(C3309t tVar, String str) {
        C0563t.a(tVar);
        return new Ba(tVar.f14425a, tVar.f14426b, tVar.g(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    private static String a(String str, String str2) {
        if (str == null || !TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(str2).concat(" must not be empty"));
    }

    public final C3277b a() {
        return new C3309t(this.f14425a, this.f14426b);
    }

    public String g() {
        return "google.com";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f14425a, false);
        c.a(parcel, 2, this.f14426b, false);
        c.a(parcel, a2);
    }
}
