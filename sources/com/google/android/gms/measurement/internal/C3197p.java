package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.measurement.internal.p  reason: case insensitive filesystem */
public final class C3197p implements Parcelable.Creator<C3187n> {
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
        return new C3187n(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3187n[i];
    }
}
