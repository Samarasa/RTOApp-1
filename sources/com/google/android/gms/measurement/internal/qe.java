package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class qe implements Parcelable.Creator<re> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b2 = b.b(parcel);
        String str = null;
        Long l = null;
        Float f2 = null;
        String str2 = null;
        String str3 = null;
        Double d2 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i = b.n(parcel2, a2);
                    break;
                case 2:
                    str = b.d(parcel2, a2);
                    break;
                case 3:
                    j = b.o(parcel2, a2);
                    break;
                case 4:
                    l = b.p(parcel2, a2);
                    break;
                case 5:
                    f2 = b.l(parcel2, a2);
                    break;
                case 6:
                    str2 = b.d(parcel2, a2);
                    break;
                case 7:
                    str3 = b.d(parcel2, a2);
                    break;
                case 8:
                    d2 = b.j(parcel2, a2);
                    break;
                default:
                    b.r(parcel2, a2);
                    break;
            }
        }
        b.g(parcel2, b2);
        return new re(i, str, j, l, f2, str2, str3, d2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new re[i];
    }
}
