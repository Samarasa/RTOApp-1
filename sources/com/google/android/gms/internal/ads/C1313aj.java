package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.aj  reason: case insensitive filesystem */
public final class C1313aj implements Parcelable.Creator<C1384bj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        C2249nqa nqa = null;
        String str = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 2) {
                nqa = (C2249nqa) b.a(parcel, a2, C2249nqa.CREATOR);
            } else if (a3 != 3) {
                b.r(parcel, a2);
            } else {
                str = b.d(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C1384bj(nqa, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1384bj[i];
    }
}
