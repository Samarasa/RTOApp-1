package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class E implements Parcelable.Creator<F> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 == 2) {
                str2 = b.d(parcel, a2);
            } else if (a3 == 3) {
                j = b.o(parcel, a2);
            } else if (a3 != 4) {
                b.r(parcel, a2);
            } else {
                str3 = b.d(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new F(str, str2, j, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new F[i];
    }
}
