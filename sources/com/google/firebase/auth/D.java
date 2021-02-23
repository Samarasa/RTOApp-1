package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class D implements Parcelable.Creator<C3311v> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = false;
        boolean z2 = false;
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
                    z = b.h(parcel, a2);
                    break;
                case 4:
                    str3 = b.d(parcel, a2);
                    break;
                case 5:
                    z2 = b.h(parcel, a2);
                    break;
                case 6:
                    str4 = b.d(parcel, a2);
                    break;
                case 7:
                    str5 = b.d(parcel, a2);
                    break;
                default:
                    b.r(parcel, a2);
                    break;
            }
        }
        b.g(parcel, b2);
        return new C3311v(str, str2, z, str3, z2, str4, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3311v[i];
    }
}
