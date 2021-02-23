package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.md  reason: case insensitive filesystem */
public final class C2151md extends a {
    public static final Parcelable.Creator<C2151md> CREATOR = new C2080ld();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11328a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11329b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11330c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f11331d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f11332e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f11333f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f11334g;

    /* renamed from: h  reason: collision with root package name */
    public final long f11335h;

    C2151md(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f11328a = z;
        this.f11329b = str;
        this.f11330c = i;
        this.f11331d = bArr;
        this.f11332e = strArr;
        this.f11333f = strArr2;
        this.f11334g = z2;
        this.f11335h = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f11328a);
        c.a(parcel, 2, this.f11329b, false);
        c.a(parcel, 3, this.f11330c);
        c.a(parcel, 4, this.f11331d, false);
        c.a(parcel, 5, this.f11332e, false);
        c.a(parcel, 6, this.f11333f, false);
        c.a(parcel, 7, this.f11334g);
        c.a(parcel, 8, this.f11335h);
        c.a(parcel, a2);
    }
}
