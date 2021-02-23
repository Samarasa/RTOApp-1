package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.Sg  reason: case insensitive filesystem */
public final class C1040Sg implements Parcelable.Creator<C1014Rg> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.n(parcel, a2);
            } else if (a3 == 2) {
                i2 = b.n(parcel, a2);
            } else if (a3 != 3) {
                b.r(parcel, a2);
            } else {
                i3 = b.n(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C1014Rg(i, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1014Rg[i];
    }
}
