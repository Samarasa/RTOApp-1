package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class QT extends a {
    public static final Parcelable.Creator<QT> CREATOR = new UT();

    /* renamed from: a  reason: collision with root package name */
    private final PT[] f8339a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f8340b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f8341c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f8342d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8343e;

    /* renamed from: f  reason: collision with root package name */
    public final PT f8344f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8345g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8346h;
    public final int i;
    public final String j;
    private final int k;
    public final int l;
    private final int m;
    private final int n;

    public QT(int i2, int i3, int i4, int i5, String str, int i6, int i7) {
        this.f8339a = PT.values();
        this.f8340b = ST.a();
        this.f8341c = RT.a();
        this.f8342d = null;
        this.f8343e = i2;
        this.f8344f = this.f8339a[i2];
        this.f8345g = i3;
        this.f8346h = i4;
        this.i = i5;
        this.j = str;
        this.k = i6;
        this.l = this.f8340b[i6];
        this.m = i7;
        this.n = this.f8341c[i7];
    }

    private QT(Context context, PT pt, int i2, int i3, int i4, String str, String str2, String str3) {
        this.f8339a = PT.values();
        this.f8340b = ST.a();
        this.f8341c = RT.a();
        this.f8342d = context;
        this.f8343e = pt.ordinal();
        this.f8344f = pt;
        this.f8345g = i2;
        this.f8346h = i3;
        this.i = i4;
        this.j = str;
        this.l = "oldest".equals(str2) ? ST.f8623a : ("lru".equals(str2) || !"lfu".equals(str2)) ? ST.f8624b : ST.f8625c;
        this.k = this.l - 1;
        "onAdClosed".equals(str3);
        this.n = RT.f8470a;
        this.m = this.n - 1;
    }

    public static QT a(PT pt, Context context) {
        if (pt == PT.Rewarded) {
            return new QT(context, pt, ((Integer) Qqa.e().a(F.Ge)).intValue(), ((Integer) Qqa.e().a(F.Me)).intValue(), ((Integer) Qqa.e().a(F.Oe)).intValue(), (String) Qqa.e().a(F.Qe), (String) Qqa.e().a(F.Ie), (String) Qqa.e().a(F.Ke));
        } else if (pt == PT.Interstitial) {
            return new QT(context, pt, ((Integer) Qqa.e().a(F.He)).intValue(), ((Integer) Qqa.e().a(F.Ne)).intValue(), ((Integer) Qqa.e().a(F.Pe)).intValue(), (String) Qqa.e().a(F.Re), (String) Qqa.e().a(F.Je), (String) Qqa.e().a(F.Le));
        } else if (pt != PT.AppOpen) {
            return null;
        } else {
            return new QT(context, pt, ((Integer) Qqa.e().a(F.Ue)).intValue(), ((Integer) Qqa.e().a(F.We)).intValue(), ((Integer) Qqa.e().a(F.Xe)).intValue(), (String) Qqa.e().a(F.Se), (String) Qqa.e().a(F.Te), (String) Qqa.e().a(F.Ve));
        }
    }

    public static boolean g() {
        return ((Boolean) Qqa.e().a(F.Fe)).booleanValue();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f8343e);
        c.a(parcel, 2, this.f8345g);
        c.a(parcel, 3, this.f8346h);
        c.a(parcel, 4, this.i);
        c.a(parcel, 5, this.j, false);
        c.a(parcel, 6, this.k);
        c.a(parcel, 7, this.m);
        c.a(parcel, a2);
    }
}
