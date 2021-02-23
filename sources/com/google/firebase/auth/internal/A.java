package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import com.google.firebase.auth.J;

public final class A implements Parcelable.Creator<x> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        D d2 = null;
        w wVar = null;
        J j = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                d2 = (D) b.a(parcel, a2, D.CREATOR);
            } else if (a3 == 2) {
                wVar = (w) b.a(parcel, a2, w.CREATOR);
            } else if (a3 != 3) {
                b.r(parcel, a2);
            } else {
                j = (J) b.a(parcel, a2, J.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new x(d2, wVar, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new x[i];
    }
}
