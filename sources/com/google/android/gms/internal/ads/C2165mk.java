package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.mk  reason: case insensitive filesystem */
public final class C2165mk extends a {
    public static final Parcelable.Creator<C2165mk> CREATOR = new C2307ok();
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public final String f11353a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11354b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public final C2462qqa f11355c;

    /* renamed from: d  reason: collision with root package name */
    public final C2249nqa f11356d;

    public C2165mk(String str, String str2, C2462qqa qqa, C2249nqa nqa) {
        this.f11353a = str;
        this.f11354b = str2;
        this.f11355c = qqa;
        this.f11356d = nqa;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f11353a, false);
        c.a(parcel, 2, this.f11354b, false);
        c.a(parcel, 3, (Parcelable) this.f11355c, i, false);
        c.a(parcel, 4, (Parcelable) this.f11356d, i, false);
        c.a(parcel, a2);
    }
}
