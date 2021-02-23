package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new h();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5455a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5456b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5457c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5458d;

    /* renamed from: e  reason: collision with root package name */
    public final float f5459e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5460f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5461g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5462h;
    public final boolean i;

    i(boolean z, boolean z2, String str, boolean z3, float f2, int i2, boolean z4, boolean z5, boolean z6) {
        this.f5455a = z;
        this.f5456b = z2;
        this.f5457c = str;
        this.f5458d = z3;
        this.f5459e = f2;
        this.f5460f = i2;
        this.f5461g = z4;
        this.f5462h = z5;
        this.i = z6;
    }

    public i(boolean z, boolean z2, boolean z3, float f2, int i2, boolean z4, boolean z5, boolean z6) {
        this(z, z2, (String) null, false, 0.0f, -1, z4, z5, z6);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f5455a);
        c.a(parcel, 3, this.f5456b);
        c.a(parcel, 4, this.f5457c, false);
        c.a(parcel, 5, this.f5458d);
        c.a(parcel, 6, this.f5459e);
        c.a(parcel, 7, this.f5460f);
        c.a(parcel, 8, this.f5461g);
        c.a(parcel, 9, this.f5462h);
        c.a(parcel, 10, this.i);
        c.a(parcel, a2);
    }
}
