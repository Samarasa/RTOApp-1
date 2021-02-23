package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.dW  reason: case insensitive filesystem */
public final class C1504dW implements Parcelable.Creator<C1291aW> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            int a3 = b.a(a2);
            if (a3 == 1) {
                i = b.n(parcel, a2);
            } else if (a3 != 2) {
                b.r(parcel, a2);
            } else {
                bArr = b.b(parcel, a2);
            }
        }
        b.g(parcel, b2);
        return new C1291aW(i, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C1291aW[i];
    }
}
