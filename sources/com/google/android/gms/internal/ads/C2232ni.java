package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.C0511q;

/* renamed from: com.google.android.gms.internal.ads.ni  reason: case insensitive filesystem */
public final class C2232ni extends C2446qia implements C2090li {
    C2232ni(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    public final void a(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) parcelFileDescriptor);
        b(1, c2);
    }

    public final void a(C0511q qVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) qVar);
        b(2, c2);
    }
}
