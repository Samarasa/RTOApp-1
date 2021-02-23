package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class Eoa implements Parcelable.Creator<Foa> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b2 = b.b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 2:
                    str = b.d(parcel2, a2);
                    break;
                case 3:
                    j = b.o(parcel2, a2);
                    break;
                case 4:
                    str2 = b.d(parcel2, a2);
                    break;
                case 5:
                    str3 = b.d(parcel2, a2);
                    break;
                case 6:
                    str4 = b.d(parcel2, a2);
                    break;
                case 7:
                    bundle = b.a(parcel2, a2);
                    break;
                case 8:
                    z = b.h(parcel2, a2);
                    break;
                case 9:
                    j2 = b.o(parcel2, a2);
                    break;
                case 10:
                    str5 = b.d(parcel2, a2);
                    break;
                case 11:
                    i = b.n(parcel2, a2);
                    break;
                default:
                    b.r(parcel2, a2);
                    break;
            }
        }
        b.g(parcel2, b2);
        return new Foa(str, j, str2, str3, str4, bundle, z, j2, str5, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Foa[i];
    }
}
