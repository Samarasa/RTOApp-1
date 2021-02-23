package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class h implements Parcelable.Creator<i> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f2 = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 2:
                    z = b.h(parcel, a2);
                    break;
                case 3:
                    z2 = b.h(parcel, a2);
                    break;
                case 4:
                    str = b.d(parcel, a2);
                    break;
                case 5:
                    z3 = b.h(parcel, a2);
                    break;
                case 6:
                    f2 = b.k(parcel, a2);
                    break;
                case 7:
                    i = b.n(parcel, a2);
                    break;
                case 8:
                    z4 = b.h(parcel, a2);
                    break;
                case 9:
                    z5 = b.h(parcel, a2);
                    break;
                case 10:
                    z6 = b.h(parcel, a2);
                    break;
                default:
                    b.r(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new i(z, z2, str, z3, f2, i, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new i[i];
    }
}
