package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.Qh  reason: case insensitive filesystem */
public final class C0989Qh implements Parcelable.Creator<C1015Rh> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                iBinder = b.m(parcel, a2);
            } else if (a3 != 2) {
                b.r(parcel, a2);
            } else {
                iBinder2 = b.m(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C1015Rh(iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1015Rh[i];
    }
}
