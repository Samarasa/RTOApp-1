package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.ok  reason: case insensitive filesystem */
public final class C2307ok implements Parcelable.Creator<C2165mk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        C2462qqa qqa = null;
        C2249nqa nqa = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 == 2) {
                str2 = b.d(parcel, a2);
            } else if (a3 == 3) {
                qqa = (C2462qqa) b.a(parcel, a2, C2462qqa.CREATOR);
            } else if (a3 != 4) {
                b.r(parcel, a2);
            } else {
                nqa = (C2249nqa) b.a(parcel, a2, C2249nqa.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new C2165mk(str, str2, qqa, nqa);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2165mk[i];
    }
}
