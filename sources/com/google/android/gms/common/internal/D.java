package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.b.d;
import com.google.android.gms.common.internal.a.b;

public final class D implements Parcelable.Creator<E> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Bundle bundle = null;
        d[] dVarArr = null;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                bundle = b.a(parcel, a2);
            } else if (a3 == 2) {
                dVarArr = (d[]) b.b(parcel, a2, d.CREATOR);
            } else if (a3 != 3) {
                b.r(parcel, a2);
            } else {
                i = b.n(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new E(bundle, dVarArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new E[i];
    }
}
