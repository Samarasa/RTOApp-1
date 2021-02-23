package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class Ge extends a {
    public static final Parcelable.Creator<Ge> CREATOR = new Je();

    /* renamed from: a  reason: collision with root package name */
    public String f13267a;

    /* renamed from: b  reason: collision with root package name */
    public String f13268b;

    /* renamed from: c  reason: collision with root package name */
    public re f13269c;

    /* renamed from: d  reason: collision with root package name */
    public long f13270d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f13271e;

    /* renamed from: f  reason: collision with root package name */
    public String f13272f;

    /* renamed from: g  reason: collision with root package name */
    public C3192o f13273g;

    /* renamed from: h  reason: collision with root package name */
    public long f13274h;
    public C3192o i;
    public long j;
    public C3192o k;

    Ge(Ge ge) {
        C0563t.a(ge);
        this.f13267a = ge.f13267a;
        this.f13268b = ge.f13268b;
        this.f13269c = ge.f13269c;
        this.f13270d = ge.f13270d;
        this.f13271e = ge.f13271e;
        this.f13272f = ge.f13272f;
        this.f13273g = ge.f13273g;
        this.f13274h = ge.f13274h;
        this.i = ge.i;
        this.j = ge.j;
        this.k = ge.k;
    }

    Ge(String str, String str2, re reVar, long j2, boolean z, String str3, C3192o oVar, long j3, C3192o oVar2, long j4, C3192o oVar3) {
        this.f13267a = str;
        this.f13268b = str2;
        this.f13269c = reVar;
        this.f13270d = j2;
        this.f13271e = z;
        this.f13272f = str3;
        this.f13273g = oVar;
        this.f13274h = j3;
        this.i = oVar2;
        this.j = j4;
        this.k = oVar3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f13267a, false);
        c.a(parcel, 3, this.f13268b, false);
        c.a(parcel, 4, (Parcelable) this.f13269c, i2, false);
        c.a(parcel, 5, this.f13270d);
        c.a(parcel, 6, this.f13271e);
        c.a(parcel, 7, this.f13272f, false);
        c.a(parcel, 8, (Parcelable) this.f13273g, i2, false);
        c.a(parcel, 9, this.f13274h);
        c.a(parcel, 10, (Parcelable) this.i, i2, false);
        c.a(parcel, 11, this.j);
        c.a(parcel, 12, (Parcelable) this.k, i2, false);
        c.a(parcel, a2);
    }
}
