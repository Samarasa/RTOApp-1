package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.wj  reason: case insensitive filesystem */
public final class C2872wj extends a {
    public static final Parcelable.Creator<C2872wj> CREATOR = new C3014yj();

    /* renamed from: a  reason: collision with root package name */
    public final String f12666a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12667b;

    public C2872wj(String str, String str2) {
        this.f12666a = str;
        this.f12667b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f12666a, false);
        c.a(parcel, 2, this.f12667b, false);
        c.a(parcel, a2);
    }
}
