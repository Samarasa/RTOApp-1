package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.b;

/* renamed from: com.google.android.gms.internal.ads.oi  reason: case insensitive filesystem */
public final class C2303oi implements Parcelable.Creator<C2161mi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = b.b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b2) {
            int a2 = b.a(parcel);
            if (b.a(a2) != 2) {
                b.r(parcel, a2);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) b.a(parcel, a2, ParcelFileDescriptor.CREATOR);
            }
        }
        b.g(parcel, b2);
        return new C2161mi(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2161mi[i];
    }
}
