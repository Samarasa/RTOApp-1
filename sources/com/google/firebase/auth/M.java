package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class M implements Parcelable.Creator<C3279d> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 == 2) {
                str2 = b.d(parcel, a2);
            } else if (a3 == 3) {
                str3 = b.d(parcel, a2);
            } else if (a3 == 4) {
                str4 = b.d(parcel, a2);
            } else if (a3 != 5) {
                b.r(parcel, a2);
            } else {
                z = b.h(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C3279d(str, str2, str3, str4, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3279d[i];
    }
}
