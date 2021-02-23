package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.yd  reason: case insensitive filesystem */
public final class C3002yd extends a {
    public static final Parcelable.Creator<C3002yd> CREATOR = new C2931xd();

    /* renamed from: a  reason: collision with root package name */
    public final String f12935a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12936b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12937c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12938d;

    public C3002yd(String str, boolean z, int i, String str2) {
        this.f12935a = str;
        this.f12936b = z;
        this.f12937c = i;
        this.f12938d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f12935a, false);
        c.a(parcel, 2, this.f12936b);
        c.a(parcel, 3, this.f12937c);
        c.a(parcel, 4, this.f12938d, false);
        c.a(parcel, a2);
    }
}
