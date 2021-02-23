package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.Xk  reason: case insensitive filesystem */
public final class C1174Xk implements Parcelable.Creator<C1200Yk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                str = b.d(parcel, a2);
            } else if (a3 == 3) {
                i = b.n(parcel, a2);
            } else if (a3 == 4) {
                i2 = b.n(parcel, a2);
            } else if (a3 == 5) {
                z = b.h(parcel, a2);
            } else if (a3 != 6) {
                b.r(parcel, a2);
            } else {
                z2 = b.h(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C1200Yk(str, i, i2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1200Yk[i];
    }
}
