package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.firebase.auth.d  reason: case insensitive filesystem */
public class C3279d extends C3277b {
    public static final Parcelable.Creator<C3279d> CREATOR = new M();

    /* renamed from: a  reason: collision with root package name */
    private String f14337a;

    /* renamed from: b  reason: collision with root package name */
    private String f14338b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14339c;

    /* renamed from: d  reason: collision with root package name */
    private String f14340d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14341e;

    C3279d(String str, String str2, String str3, String str4, boolean z) {
        C0563t.b(str);
        this.f14337a = str;
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.f14338b = str2;
            this.f14339c = str3;
            this.f14340d = str4;
            this.f14341e = z;
            return;
        }
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }

    public final C3277b a() {
        return new C3279d(this.f14337a, this.f14338b, this.f14339c, this.f14340d, this.f14341e);
    }

    public final C3279d a(C3306p pVar) {
        this.f14340d = pVar.u();
        this.f14341e = true;
        return this;
    }

    public final String b() {
        return this.f14337a;
    }

    public String g() {
        return "password";
    }

    public String h() {
        return !TextUtils.isEmpty(this.f14338b) ? "password" : "emailLink";
    }

    public final String i() {
        return this.f14338b;
    }

    public final String j() {
        return this.f14339c;
    }

    public final boolean k() {
        return !TextUtils.isEmpty(this.f14339c);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f14337a, false);
        c.a(parcel, 2, this.f14338b, false);
        c.a(parcel, 3, this.f14339c, false);
        c.a(parcel, 4, this.f14340d, false);
        c.a(parcel, 5, this.f14341e);
        c.a(parcel, a2);
    }
}
