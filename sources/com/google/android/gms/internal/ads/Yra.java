package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class Yra extends a {
    public static final Parcelable.Creator<Yra> CREATOR = new Xra();

    /* renamed from: a  reason: collision with root package name */
    private final int f9505a;

    public Yra(int i) {
        this.f9505a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f9505a);
        c.a(parcel, a2);
    }
}
