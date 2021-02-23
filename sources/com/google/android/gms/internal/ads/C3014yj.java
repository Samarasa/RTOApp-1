package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.yj  reason: case insensitive filesystem */
public final class C3014yj implements Parcelable.Creator<C2872wj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 != 2) {
                b.r(parcel, a2);
            } else {
                str2 = b.d(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C2872wj(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2872wj[i];
    }
}
