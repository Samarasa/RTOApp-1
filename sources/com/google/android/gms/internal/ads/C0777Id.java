package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.Id  reason: case insensitive filesystem */
public final class C0777Id implements Parcelable.Creator<C0803Jd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                str = b.d(parcel, a2);
            } else if (a3 != 2) {
                b.r(parcel, a2);
            } else {
                bundle = b.a(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C0803Jd(str, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0803Jd[i];
    }
}
