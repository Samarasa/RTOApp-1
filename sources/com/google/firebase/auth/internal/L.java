package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import com.google.firebase.auth.F;
import java.util.ArrayList;

public final class L implements Parcelable.Creator<M> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        ArrayList<F> arrayList = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 == 2) {
                str2 = b.d(parcel, a2);
            } else if (a3 != 3) {
                b.r(parcel, a2);
            } else {
                arrayList = b.c(parcel, a2, F.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new M(str, str2, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new M[i];
    }
}
