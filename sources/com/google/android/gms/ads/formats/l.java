package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class l implements Parcelable.Creator<i> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        IBinder iBinder = null;
        boolean z = false;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                z = b.h(parcel, a2);
            } else if (a3 == 2) {
                iBinder = b.m(parcel, a2);
            } else if (a3 != 3) {
                b.r(parcel, a2);
            } else {
                iBinder2 = b.m(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new i(z, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new i[i];
    }
}
