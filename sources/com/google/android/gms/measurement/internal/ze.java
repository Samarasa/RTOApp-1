package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;
import java.util.ArrayList;
import java.util.List;

public final class ze implements Parcelable.Creator<xe> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b2 = b.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 2:
                    str = b.d(parcel2, a2);
                    break;
                case 3:
                    str2 = b.d(parcel2, a2);
                    break;
                case 4:
                    str3 = b.d(parcel2, a2);
                    break;
                case 5:
                    str4 = b.d(parcel2, a2);
                    break;
                case 6:
                    j = b.o(parcel2, a2);
                    break;
                case 7:
                    j2 = b.o(parcel2, a2);
                    break;
                case 8:
                    str5 = b.d(parcel2, a2);
                    break;
                case 9:
                    z = b.h(parcel2, a2);
                    break;
                case 10:
                    z2 = b.h(parcel2, a2);
                    break;
                case 11:
                    j6 = b.o(parcel2, a2);
                    break;
                case 12:
                    str6 = b.d(parcel2, a2);
                    break;
                case 13:
                    j3 = b.o(parcel2, a2);
                    break;
                case 14:
                    j4 = b.o(parcel2, a2);
                    break;
                case 15:
                    i = b.n(parcel2, a2);
                    break;
                case 16:
                    z3 = b.h(parcel2, a2);
                    break;
                case 17:
                    z4 = b.h(parcel2, a2);
                    break;
                case 18:
                    z5 = b.h(parcel2, a2);
                    break;
                case 19:
                    str7 = b.d(parcel2, a2);
                    break;
                case 21:
                    bool = b.i(parcel2, a2);
                    break;
                case 22:
                    j5 = b.o(parcel2, a2);
                    break;
                case 23:
                    arrayList = b.f(parcel2, a2);
                    break;
                case 24:
                    str8 = b.d(parcel2, a2);
                    break;
                default:
                    b.r(parcel2, a2);
                    break;
            }
        }
        b.g(parcel2, b2);
        return new xe(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, (List<String>) arrayList, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new xe[i];
    }
}
