package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.xd  reason: case insensitive filesystem */
public final class C2931xd implements Parcelable.Creator<C3002yd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 == 2) {
                z = b.h(parcel, a2);
            } else if (a3 == 3) {
                i = b.n(parcel, a2);
            } else if (a3 != 4) {
                b.r(parcel, a2);
            } else {
                str2 = b.d(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C3002yd(str, z, i, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3002yd[i];
    }
}
