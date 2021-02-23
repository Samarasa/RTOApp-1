package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.Kd  reason: case insensitive filesystem */
public final class C0829Kd implements Parcelable.Creator<C0855Ld> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i2 = b.n(parcel, a2);
            } else if (a3 == 2) {
                str = b.d(parcel, a2);
            } else if (a3 == 3) {
                i3 = b.n(parcel, a2);
            } else if (a3 != 1000) {
                b.r(parcel, a2);
            } else {
                i = b.n(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C0855Ld(i, i2, str, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0855Ld[i];
    }
}
