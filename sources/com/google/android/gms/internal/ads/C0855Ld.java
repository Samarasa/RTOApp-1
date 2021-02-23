package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.Ld  reason: case insensitive filesystem */
public final class C0855Ld extends a {
    public static final Parcelable.Creator<C0855Ld> CREATOR = new C0829Kd();

    /* renamed from: a  reason: collision with root package name */
    public final int f7687a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7688b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7689c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7690d;

    public C0855Ld(int i, int i2, String str, int i3) {
        this.f7687a = i;
        this.f7688b = i2;
        this.f7689c = str;
        this.f7690d = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f7688b);
        c.a(parcel, 2, this.f7689c, false);
        c.a(parcel, 3, this.f7690d);
        c.a(parcel, 1000, this.f7687a);
        c.a(parcel, a2);
    }
}
