package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0562s;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.nqa  reason: case insensitive filesystem */
public final class C2249nqa extends a {
    public static final Parcelable.Creator<C2249nqa> CREATOR = new C2391pqa();

    /* renamed from: a  reason: collision with root package name */
    public final int f11534a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public final long f11535b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f11536c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public final int f11537d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f11538e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11539f;

    /* renamed from: g  reason: collision with root package name */
    public final int f11540g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11541h;
    public final String i;
    public final C1693g j;
    public final Location k;
    public final String l;
    public final Bundle m;
    public final Bundle n;
    public final List<String> o;
    public final String p;
    public final String q;
    @Deprecated
    public final boolean r;
    public final C1682fqa s;
    public final int t;
    public final String u;
    public final List<String> v;
    public final int w;

    public C2249nqa(int i2, long j2, Bundle bundle, int i3, List<String> list, boolean z, int i4, boolean z2, String str, C1693g gVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, C1682fqa fqa, int i5, String str5, List<String> list3, int i6) {
        this.f11534a = i2;
        this.f11535b = j2;
        this.f11536c = bundle == null ? new Bundle() : bundle;
        this.f11537d = i3;
        this.f11538e = list;
        this.f11539f = z;
        this.f11540g = i4;
        this.f11541h = z2;
        this.i = str;
        this.j = gVar;
        this.k = location;
        this.l = str2;
        this.m = bundle2 == null ? new Bundle() : bundle2;
        this.n = bundle3;
        this.o = list2;
        this.p = str3;
        this.q = str4;
        this.r = z3;
        this.s = fqa;
        this.t = i5;
        this.u = str5;
        this.v = list3 == null ? new ArrayList<>() : list3;
        this.w = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2249nqa)) {
            return false;
        }
        C2249nqa nqa = (C2249nqa) obj;
        return this.f11534a == nqa.f11534a && this.f11535b == nqa.f11535b && C0562s.a(this.f11536c, nqa.f11536c) && this.f11537d == nqa.f11537d && C0562s.a(this.f11538e, nqa.f11538e) && this.f11539f == nqa.f11539f && this.f11540g == nqa.f11540g && this.f11541h == nqa.f11541h && C0562s.a(this.i, nqa.i) && C0562s.a(this.j, nqa.j) && C0562s.a(this.k, nqa.k) && C0562s.a(this.l, nqa.l) && C0562s.a(this.m, nqa.m) && C0562s.a(this.n, nqa.n) && C0562s.a(this.o, nqa.o) && C0562s.a(this.p, nqa.p) && C0562s.a(this.q, nqa.q) && this.r == nqa.r && this.t == nqa.t && C0562s.a(this.u, nqa.u) && C0562s.a(this.v, nqa.v) && this.w == nqa.w;
    }

    public final int hashCode() {
        return C0562s.a(Integer.valueOf(this.f11534a), Long.valueOf(this.f11535b), this.f11536c, Integer.valueOf(this.f11537d), this.f11538e, Boolean.valueOf(this.f11539f), Integer.valueOf(this.f11540g), Boolean.valueOf(this.f11541h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r), Integer.valueOf(this.t), this.u, this.v, Integer.valueOf(this.w));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f11534a);
        c.a(parcel, 2, this.f11535b);
        c.a(parcel, 3, this.f11536c, false);
        c.a(parcel, 4, this.f11537d);
        c.b(parcel, 5, this.f11538e, false);
        c.a(parcel, 6, this.f11539f);
        c.a(parcel, 7, this.f11540g);
        c.a(parcel, 8, this.f11541h);
        c.a(parcel, 9, this.i, false);
        c.a(parcel, 10, (Parcelable) this.j, i2, false);
        c.a(parcel, 11, (Parcelable) this.k, i2, false);
        c.a(parcel, 12, this.l, false);
        c.a(parcel, 13, this.m, false);
        c.a(parcel, 14, this.n, false);
        c.b(parcel, 15, this.o, false);
        c.a(parcel, 16, this.p, false);
        c.a(parcel, 17, this.q, false);
        c.a(parcel, 18, this.r);
        c.a(parcel, 19, (Parcelable) this.s, i2, false);
        c.a(parcel, 20, this.t);
        c.a(parcel, 21, this.u, false);
        c.b(parcel, 22, this.v, false);
        c.a(parcel, 23, this.w);
        c.a(parcel, a2);
    }
}
