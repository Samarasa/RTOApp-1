package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.bW  reason: case insensitive filesystem */
public final class C1362bW implements Parcelable.Creator<ZV> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.n(parcel, a2);
            } else if (a3 == 2) {
                str = b.d(parcel, a2);
            } else if (a3 != 3) {
                b.r(parcel, a2);
            } else {
                str2 = b.d(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new ZV(i, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ZV[i];
    }
}
