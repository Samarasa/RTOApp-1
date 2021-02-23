package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

public final class t implements Parcelable.Creator<b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            if (b.a(a2) != 2) {
                b.r(parcel, a2);
            } else {
                bundle = b.a(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new b(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new b[i];
    }
}
