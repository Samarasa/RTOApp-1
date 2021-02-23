package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.vqa  reason: case insensitive filesystem */
public final class C2816vqa implements Parcelable.Creator<C2603sqa> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.n(parcel, a2);
            } else if (a3 == 2) {
                i2 = b.n(parcel, a2);
            } else if (a3 == 3) {
                str = b.d(parcel, a2);
            } else if (a3 != 4) {
                b.r(parcel, a2);
            } else {
                j = b.o(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C2603sqa(i, i2, str, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2603sqa[i];
    }
}
