package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class C implements Parcelable.Creator<z> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            switch (b.a(a2)) {
                case 1:
                    str = b.d(parcel, a2);
                    break;
                case 2:
                    str2 = b.d(parcel, a2);
                    break;
                case 3:
                    str5 = b.d(parcel, a2);
                    break;
                case 4:
                    str4 = b.d(parcel, a2);
                    break;
                case 5:
                    str3 = b.d(parcel, a2);
                    break;
                case 6:
                    str6 = b.d(parcel, a2);
                    break;
                case 7:
                    z = b.h(parcel, a2);
                    break;
                case 8:
                    str7 = b.d(parcel, a2);
                    break;
                default:
                    b.r(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new z(str, str2, str3, str4, str5, str6, z, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new z[i];
    }
}
