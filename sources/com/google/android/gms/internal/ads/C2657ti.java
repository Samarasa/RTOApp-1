package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.ti  reason: case insensitive filesystem */
public final class C2657ti extends a {
    public static final Parcelable.Creator<C2657ti> CREATOR = new C2586si();

    /* renamed from: a  reason: collision with root package name */
    String f12232a;

    public C2657ti(String str) {
        this.f12232a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f12232a, false);
        c.a(parcel, a2);
    }
}
