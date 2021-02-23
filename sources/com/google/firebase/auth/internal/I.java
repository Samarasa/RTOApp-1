package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class I implements Parcelable.Creator<F> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                j = b.o(parcel, a2);
            } else if (a3 != 2) {
                b.r(parcel, a2);
            } else {
                j2 = b.o(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new F(j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new F[i];
    }
}
