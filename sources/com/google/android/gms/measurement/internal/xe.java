package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.List;

public final class xe extends a {
    public static final Parcelable.Creator<xe> CREATOR = new ze();

    /* renamed from: a  reason: collision with root package name */
    public final String f13822a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13823b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13824c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13825d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13826e;

    /* renamed from: f  reason: collision with root package name */
    public final long f13827f;

    /* renamed from: g  reason: collision with root package name */
    public final String f13828g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13829h;
    public final boolean i;
    public final long j;
    public final String k;
    public final long l;
    public final long m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final Boolean s;
    public final long t;
    public final List<String> u;
    public final String v;

    xe(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z, boolean z2, String str6, long j5, long j6, int i2, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j7, List<String> list, String str8) {
        C0563t.b(str);
        this.f13822a = str;
        this.f13823b = TextUtils.isEmpty(str2) ? null : str2;
        this.f13824c = str3;
        this.j = j2;
        this.f13825d = str4;
        this.f13826e = j3;
        this.f13827f = j4;
        this.f13828g = str5;
        this.f13829h = z;
        this.i = z2;
        this.k = str6;
        this.l = j5;
        this.m = j6;
        this.n = i2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = str7;
        this.s = bool;
        this.t = j7;
        this.u = list;
        this.v = str8;
    }

    xe(String str, String str2, String str3, String str4, long j2, long j3, String str5, boolean z, boolean z2, long j4, String str6, long j5, long j6, int i2, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j7, List<String> list, String str8) {
        this.f13822a = str;
        this.f13823b = str2;
        this.f13824c = str3;
        this.j = j4;
        this.f13825d = str4;
        this.f13826e = j2;
        this.f13827f = j3;
        this.f13828g = str5;
        this.f13829h = z;
        this.i = z2;
        this.k = str6;
        this.l = j5;
        this.m = j6;
        this.n = i2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = str7;
        this.s = bool;
        this.t = j7;
        this.u = list;
        this.v = str8;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f13822a, false);
        c.a(parcel, 3, this.f13823b, false);
        c.a(parcel, 4, this.f13824c, false);
        c.a(parcel, 5, this.f13825d, false);
        c.a(parcel, 6, this.f13826e);
        c.a(parcel, 7, this.f13827f);
        c.a(parcel, 8, this.f13828g, false);
        c.a(parcel, 9, this.f13829h);
        c.a(parcel, 10, this.i);
        c.a(parcel, 11, this.j);
        c.a(parcel, 12, this.k, false);
        c.a(parcel, 13, this.l);
        c.a(parcel, 14, this.m);
        c.a(parcel, 15, this.n);
        c.a(parcel, 16, this.o);
        c.a(parcel, 17, this.p);
        c.a(parcel, 18, this.q);
        c.a(parcel, 19, this.r, false);
        c.a(parcel, 21, this.s, false);
        c.a(parcel, 22, this.t);
        c.b(parcel, 23, this.u, false);
        c.a(parcel, 24, this.v, false);
        c.a(parcel, a2);
    }
}
