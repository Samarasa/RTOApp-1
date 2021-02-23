package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.m  reason: case insensitive filesystem */
public final class C2118m implements Parcelable.Creator<C1905j> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                z = b.h(parcel, a2);
            } else if (a3 == 3) {
                z2 = b.h(parcel, a2);
            } else if (a3 != 4) {
                b.r(parcel, a2);
            } else {
                z3 = b.h(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C1905j(z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1905j[i];
    }
}
