package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Yh  reason: case insensitive filesystem */
public final class C1197Yh extends a {
    public static final Parcelable.Creator<C1197Yh> CREATOR = new C1311ai();
    private final long A;
    private final String B;
    private final float C;
    private final int D;
    private final int E;
    private final boolean F;
    private final boolean G;
    private final String H;
    private final boolean I;
    private final String J;
    private final boolean K;
    private final int L;
    private final Bundle M;
    private final String N;
    private final Yra O;
    private final boolean P;
    private final Bundle Q;
    private final String R;
    private final String S;
    private final String T;
    private final boolean U;
    private final List<Integer> V;
    private final String W;
    private final List<String> X;
    private final int Y;
    private final boolean Z;

    /* renamed from: a  reason: collision with root package name */
    private final int f9437a;
    private final boolean aa;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f9438b;
    private final boolean ba;

    /* renamed from: c  reason: collision with root package name */
    private final C2249nqa f9439c;
    private final ArrayList<String> ca;

    /* renamed from: d  reason: collision with root package name */
    private final C2462qqa f9440d;
    private final String da;

    /* renamed from: e  reason: collision with root package name */
    private final String f9441e;
    private final C0855Ld ea;

    /* renamed from: f  reason: collision with root package name */
    private final ApplicationInfo f9442f;
    private final String fa;

    /* renamed from: g  reason: collision with root package name */
    private final PackageInfo f9443g;
    private final Bundle ga;

    /* renamed from: h  reason: collision with root package name */
    private final String f9444h;
    private final String i;
    private final String j;
    private final C1200Yk k;
    private final Bundle l;
    private final int m;
    private final List<String> n;
    private final Bundle o;
    private final boolean p;
    private final int q;
    private final int r;
    private final float s;
    private final String t;
    private final long u;
    private final String v;
    private final List<String> w;
    private final String x;
    private final C1368bb y;
    private final List<String> z;

    C1197Yh(int i2, Bundle bundle, C2249nqa nqa, C2462qqa qqa, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, C1200Yk yk, Bundle bundle2, int i3, List<String> list, Bundle bundle3, boolean z2, int i4, int i5, float f2, String str5, long j2, String str6, List<String> list2, String str7, C1368bb bbVar, List<String> list3, long j3, String str8, float f3, boolean z3, int i6, int i7, boolean z4, boolean z5, String str9, String str10, boolean z6, int i8, Bundle bundle4, String str11, Yra yra, boolean z7, Bundle bundle5, String str12, String str13, String str14, boolean z8, List<Integer> list4, String str15, List<String> list5, int i9, boolean z9, boolean z10, boolean z11, ArrayList<String> arrayList, String str16, C0855Ld ld, String str17, Bundle bundle6) {
        this.f9437a = i2;
        this.f9438b = bundle;
        this.f9439c = nqa;
        this.f9440d = qqa;
        this.f9441e = str;
        this.f9442f = applicationInfo;
        this.f9443g = packageInfo;
        this.f9444h = str2;
        this.i = str3;
        this.j = str4;
        this.k = yk;
        this.l = bundle2;
        this.m = i3;
        this.n = list;
        this.z = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.o = bundle3;
        this.p = z2;
        this.q = i4;
        this.r = i5;
        this.s = f2;
        this.t = str5;
        this.u = j2;
        this.v = str6;
        this.w = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.x = str7;
        this.y = bbVar;
        this.A = j3;
        this.B = str8;
        this.C = f3;
        this.I = z3;
        this.D = i6;
        this.E = i7;
        this.F = z4;
        this.G = z5;
        this.H = str9;
        this.J = str10;
        this.K = z6;
        this.L = i8;
        this.M = bundle4;
        this.N = str11;
        this.O = yra;
        this.P = z7;
        this.Q = bundle5;
        this.R = str12;
        this.S = str13;
        this.T = str14;
        this.U = z8;
        this.V = list4;
        this.W = str15;
        this.X = list5;
        this.Y = i9;
        this.Z = z9;
        this.aa = z10;
        this.ba = z11;
        this.ca = arrayList;
        this.da = str16;
        this.ea = ld;
        this.fa = str17;
        this.ga = bundle6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f9437a);
        c.a(parcel, 2, this.f9438b, false);
        c.a(parcel, 3, (Parcelable) this.f9439c, i2, false);
        c.a(parcel, 4, (Parcelable) this.f9440d, i2, false);
        c.a(parcel, 5, this.f9441e, false);
        c.a(parcel, 6, (Parcelable) this.f9442f, i2, false);
        c.a(parcel, 7, (Parcelable) this.f9443g, i2, false);
        c.a(parcel, 8, this.f9444h, false);
        c.a(parcel, 9, this.i, false);
        c.a(parcel, 10, this.j, false);
        c.a(parcel, 11, (Parcelable) this.k, i2, false);
        c.a(parcel, 12, this.l, false);
        c.a(parcel, 13, this.m);
        c.b(parcel, 14, this.n, false);
        c.a(parcel, 15, this.o, false);
        c.a(parcel, 16, this.p);
        c.a(parcel, 18, this.q);
        c.a(parcel, 19, this.r);
        c.a(parcel, 20, this.s);
        c.a(parcel, 21, this.t, false);
        c.a(parcel, 25, this.u);
        c.a(parcel, 26, this.v, false);
        c.b(parcel, 27, this.w, false);
        c.a(parcel, 28, this.x, false);
        c.a(parcel, 29, (Parcelable) this.y, i2, false);
        c.b(parcel, 30, this.z, false);
        c.a(parcel, 31, this.A);
        c.a(parcel, 33, this.B, false);
        c.a(parcel, 34, this.C);
        c.a(parcel, 35, this.D);
        c.a(parcel, 36, this.E);
        c.a(parcel, 37, this.F);
        c.a(parcel, 38, this.G);
        c.a(parcel, 39, this.H, false);
        c.a(parcel, 40, this.I);
        c.a(parcel, 41, this.J, false);
        c.a(parcel, 42, this.K);
        c.a(parcel, 43, this.L);
        c.a(parcel, 44, this.M, false);
        c.a(parcel, 45, this.N, false);
        c.a(parcel, 46, (Parcelable) this.O, i2, false);
        c.a(parcel, 47, this.P);
        c.a(parcel, 48, this.Q, false);
        c.a(parcel, 49, this.R, false);
        c.a(parcel, 50, this.S, false);
        c.a(parcel, 51, this.T, false);
        c.a(parcel, 52, this.U);
        c.a(parcel, 53, this.V, false);
        c.a(parcel, 54, this.W, false);
        c.b(parcel, 55, this.X, false);
        c.a(parcel, 56, this.Y);
        c.a(parcel, 57, this.Z);
        c.a(parcel, 58, this.aa);
        c.a(parcel, 59, this.ba);
        c.b(parcel, 60, this.ca, false);
        c.a(parcel, 61, this.da, false);
        c.a(parcel, 63, (Parcelable) this.ea, i2, false);
        c.a(parcel, 64, this.fa, false);
        c.a(parcel, 65, this.ga, false);
        c.a(parcel, a2);
    }
}
