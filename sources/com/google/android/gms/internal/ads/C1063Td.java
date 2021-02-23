package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Td  reason: case insensitive filesystem */
public final class C1063Td extends C2446qia implements C1037Sd {
    C1063Td(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public final void a(C0907Nd nd) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) nd);
        b(1, c2);
    }

    public final void d(C1824hqa hqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) hqa);
        b(3, c2);
    }

    public final void l(int i) {
        Parcel c2 = c();
        c2.writeInt(i);
        b(2, c2);
    }
}
