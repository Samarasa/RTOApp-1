package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class K implements Parcelable.Creator<C3312w> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            b.a(a2);
            b.r(parcel, a2);
        }
        b.g(parcel, b2);
        return new C3312w();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3312w[i];
    }
}
