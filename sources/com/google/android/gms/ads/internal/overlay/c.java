package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;

public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    private final String f5485a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5486b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5487c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5488d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5489e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5490f;

    /* renamed from: g  reason: collision with root package name */
    private final String f5491g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f5492h;

    public c(Intent intent) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intent);
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, (Intent) null);
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.f5485a = str;
        this.f5486b = str2;
        this.f5487c = str3;
        this.f5488d = str4;
        this.f5489e = str5;
        this.f5490f = str6;
        this.f5491g = str7;
        this.f5492h = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.a.c.a(parcel);
        com.google.android.gms.common.internal.a.c.a(parcel, 2, this.f5485a, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 3, this.f5486b, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 4, this.f5487c, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 5, this.f5488d, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 6, this.f5489e, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 7, this.f5490f, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 8, this.f5491g, false);
        com.google.android.gms.common.internal.a.c.a(parcel, 9, (Parcelable) this.f5492h, i, false);
        com.google.android.gms.common.internal.a.c.a(parcel, a2);
    }
}
