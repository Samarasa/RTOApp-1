package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.kj  reason: case insensitive filesystem */
public final class C2021kj implements Parcelable.Creator<C1809hj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                str = b.d(parcel, a2);
            } else if (a3 != 3) {
                b.r(parcel, a2);
            } else {
                i = b.n(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C1809hj(str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1809hj[i];
    }
}
