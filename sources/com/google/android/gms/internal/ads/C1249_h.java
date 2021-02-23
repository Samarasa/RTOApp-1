package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads._h  reason: case insensitive filesystem */
public final class C1249_h extends a {
    public static final Parcelable.Creator<C1249_h> CREATOR = new C1453ci();
    private final boolean A;
    private final boolean B;
    private final C1809hj C;
    private final List<String> D;
    private final List<String> E;
    private final boolean F;
    private final C1382bi G;
    private final boolean H;
    private String I;
    private final List<String> J;
    private final boolean K;
    private final String L;
    private final C0809Jj M;
    private final String N;
    private final boolean O;
    private final boolean P;
    private Bundle Q;
    private final boolean R;
    private final int S;
    private final boolean T;
    private final List<String> U;
    private final boolean V;
    private final String W;
    private String X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private final int f9682a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9683b;

    /* renamed from: c  reason: collision with root package name */
    private String f9684c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f9685d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9686e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f9687f;

    /* renamed from: g  reason: collision with root package name */
    private final long f9688g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f9689h;
    private final long i;
    private final List<String> j;
    private final long k;
    private final int l;
    private final String m;
    private final long n;
    private final String o;
    private final boolean p;
    private final String q;
    private final String r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private C2161mi x;
    private String y;
    private final String z;

    C1249_h(int i2, String str, String str2, List<String> list, int i3, List<String> list2, long j2, boolean z2, long j3, List<String> list3, long j4, int i4, String str3, long j5, String str4, boolean z3, String str5, String str6, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, C2161mi miVar, String str7, String str8, boolean z9, boolean z10, C1809hj hjVar, List<String> list4, List<String> list5, boolean z11, C1382bi biVar, boolean z12, String str9, List<String> list6, boolean z13, String str10, C0809Jj jj, String str11, boolean z14, boolean z15, Bundle bundle, boolean z16, int i5, boolean z17, List<String> list7, boolean z18, String str12, String str13, boolean z19, boolean z20) {
        C2161mi miVar2;
        C2657ti tiVar;
        this.f9682a = i2;
        this.f9683b = str;
        this.f9684c = str2;
        List<String> list8 = null;
        this.f9685d = list != null ? Collections.unmodifiableList(list) : null;
        this.f9686e = i3;
        this.f9687f = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f9688g = j2;
        this.f9689h = z2;
        this.i = j3;
        this.j = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.k = j4;
        this.l = i4;
        this.m = str3;
        this.n = j5;
        this.o = str4;
        this.p = z3;
        this.q = str5;
        this.r = str6;
        this.s = z4;
        this.t = z5;
        this.u = z6;
        this.v = z7;
        this.O = z14;
        this.w = z8;
        this.x = miVar;
        this.y = str7;
        this.z = str8;
        if (this.f9684c == null && (miVar2 = this.x) != null && (tiVar = (C2657ti) miVar2.a(C2657ti.CREATOR)) != null && !TextUtils.isEmpty(tiVar.f12232a)) {
            this.f9684c = tiVar.f12232a;
        }
        this.A = z9;
        this.B = z10;
        this.C = hjVar;
        this.D = list4;
        this.E = list5;
        this.F = z11;
        this.G = biVar;
        this.H = z12;
        this.I = str9;
        this.J = list6;
        this.K = z13;
        this.L = str10;
        this.M = jj;
        this.N = str11;
        this.P = z15;
        this.Q = bundle;
        this.R = z16;
        this.S = i5;
        this.T = z17;
        this.U = list7 != null ? Collections.unmodifiableList(list7) : list8;
        this.V = z18;
        this.W = str12;
        this.X = str13;
        this.Y = z19;
        this.Z = z20;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f9682a);
        c.a(parcel, 2, this.f9683b, false);
        c.a(parcel, 3, this.f9684c, false);
        c.b(parcel, 4, this.f9685d, false);
        c.a(parcel, 5, this.f9686e);
        c.b(parcel, 6, this.f9687f, false);
        c.a(parcel, 7, this.f9688g);
        c.a(parcel, 8, this.f9689h);
        c.a(parcel, 9, this.i);
        c.b(parcel, 10, this.j, false);
        c.a(parcel, 11, this.k);
        c.a(parcel, 12, this.l);
        c.a(parcel, 13, this.m, false);
        c.a(parcel, 14, this.n);
        c.a(parcel, 15, this.o, false);
        c.a(parcel, 18, this.p);
        c.a(parcel, 19, this.q, false);
        c.a(parcel, 21, this.r, false);
        c.a(parcel, 22, this.s);
        c.a(parcel, 23, this.t);
        c.a(parcel, 24, this.u);
        c.a(parcel, 25, this.v);
        c.a(parcel, 26, this.w);
        c.a(parcel, 28, (Parcelable) this.x, i2, false);
        c.a(parcel, 29, this.y, false);
        c.a(parcel, 30, this.z, false);
        c.a(parcel, 31, this.A);
        c.a(parcel, 32, this.B);
        c.a(parcel, 33, (Parcelable) this.C, i2, false);
        c.b(parcel, 34, this.D, false);
        c.b(parcel, 35, this.E, false);
        c.a(parcel, 36, this.F);
        c.a(parcel, 37, (Parcelable) this.G, i2, false);
        c.a(parcel, 38, this.H);
        c.a(parcel, 39, this.I, false);
        c.b(parcel, 40, this.J, false);
        c.a(parcel, 42, this.K);
        c.a(parcel, 43, this.L, false);
        c.a(parcel, 44, (Parcelable) this.M, i2, false);
        c.a(parcel, 45, this.N, false);
        c.a(parcel, 46, this.O);
        c.a(parcel, 47, this.P);
        c.a(parcel, 48, this.Q, false);
        c.a(parcel, 49, this.R);
        c.a(parcel, 50, this.S);
        c.a(parcel, 51, this.T);
        c.b(parcel, 52, this.U, false);
        c.a(parcel, 53, this.V);
        c.a(parcel, 54, this.W, false);
        c.a(parcel, 55, this.X, false);
        c.a(parcel, 56, this.Y);
        c.a(parcel, 57, this.Z);
        c.a(parcel, a2);
    }
}
