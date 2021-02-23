package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class Xra implements Parcelable.Creator<Yra> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            if (b.a(a2) != 2) {
                b.r(parcel, a2);
            } else {
                i = b.n(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new Yra(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Yra[i];
    }
}
