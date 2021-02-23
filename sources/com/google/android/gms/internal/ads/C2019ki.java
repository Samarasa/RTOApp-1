package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.C0511q;

/* renamed from: com.google.android.gms.internal.ads.ki  reason: case insensitive filesystem */
public abstract class C2019ki extends C2587sia implements C2090li {
    public C2019ki() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a((ParcelFileDescriptor) C2516ria.a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            a((C0511q) C2516ria.a(parcel, C0511q.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
