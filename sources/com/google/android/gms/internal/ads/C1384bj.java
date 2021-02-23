package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.bj  reason: case insensitive filesystem */
public final class C1384bj extends a {
    public static final Parcelable.Creator<C1384bj> CREATOR = new C1313aj();

    /* renamed from: a  reason: collision with root package name */
    public final C2249nqa f9949a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9950b;

    public C1384bj(C2249nqa nqa, String str) {
        this.f9949a = nqa;
        this.f9950b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, (Parcelable) this.f9949a, i, false);
        c.a(parcel, 3, this.f9950b, false);
        c.a(parcel, a2);
    }
}
