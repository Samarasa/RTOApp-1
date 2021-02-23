package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ri  reason: case insensitive filesystem */
public final class C2515ri extends a {
    public static final Parcelable.Creator<C2515ri> CREATOR = new C2445qi();

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f12015a;

    /* renamed from: b  reason: collision with root package name */
    public final C1200Yk f12016b;

    /* renamed from: c  reason: collision with root package name */
    public final ApplicationInfo f12017c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12018d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f12019e;

    /* renamed from: f  reason: collision with root package name */
    public final PackageInfo f12020f;

    /* renamed from: g  reason: collision with root package name */
    public final String f12021g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f12022h;
    public final String i;
    public QT j;
    public String k;

    public C2515ri(Bundle bundle, C1200Yk yk, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3, QT qt, String str4) {
        this.f12015a = bundle;
        this.f12016b = yk;
        this.f12018d = str;
        this.f12017c = applicationInfo;
        this.f12019e = list;
        this.f12020f = packageInfo;
        this.f12021g = str2;
        this.f12022h = z;
        this.i = str3;
        this.j = qt;
        this.k = str4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f12015a, false);
        c.a(parcel, 2, (Parcelable) this.f12016b, i2, false);
        c.a(parcel, 3, (Parcelable) this.f12017c, i2, false);
        c.a(parcel, 4, this.f12018d, false);
        c.b(parcel, 5, this.f12019e, false);
        c.a(parcel, 6, (Parcelable) this.f12020f, i2, false);
        c.a(parcel, 7, this.f12021g, false);
        c.a(parcel, 8, this.f12022h);
        c.a(parcel, 9, this.i, false);
        c.a(parcel, 10, (Parcelable) this.j, i2, false);
        c.a(parcel, 11, this.k, false);
        c.a(parcel, a2);
    }
}
