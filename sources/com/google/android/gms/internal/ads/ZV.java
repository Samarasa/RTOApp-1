package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class ZV extends a {
    public static final Parcelable.Creator<ZV> CREATOR = new C1362bW();

    /* renamed from: a  reason: collision with root package name */
    private final int f9553a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9554b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9555c;

    ZV(int i, String str, String str2) {
        this.f9553a = i;
        this.f9554b = str;
        this.f9555c = str2;
    }

    public ZV(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f9553a);
        c.a(parcel, 2, this.f9554b, false);
        c.a(parcel, 3, this.f9555c, false);
        c.a(parcel, a2);
    }
}
