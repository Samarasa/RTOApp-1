package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class YV extends a {
    public static final Parcelable.Creator<YV> CREATOR = new XV();

    /* renamed from: a  reason: collision with root package name */
    private final int f9359a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f9360b;

    YV(int i, byte[] bArr) {
        this.f9359a = i;
        this.f9360b = bArr;
    }

    public YV(byte[] bArr) {
        this(1, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f9359a);
        c.a(parcel, 2, this.f9360b, false);
        c.a(parcel, a2);
    }
}
