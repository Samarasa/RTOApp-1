package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class UT implements Parcelable.Creator<QT> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    i = b.n(parcel, a2);
                    break;
                case 2:
                    i2 = b.n(parcel, a2);
                    break;
                case 3:
                    i3 = b.n(parcel, a2);
                    break;
                case 4:
                    i4 = b.n(parcel, a2);
                    break;
                case 5:
                    str = b.d(parcel, a2);
                    break;
                case 6:
                    i5 = b.n(parcel, a2);
                    break;
                case 7:
                    i6 = b.n(parcel, a2);
                    break;
                default:
                    b.r(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new QT(i, i2, i3, i4, str, i5, i6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new QT[i];
    }
}
