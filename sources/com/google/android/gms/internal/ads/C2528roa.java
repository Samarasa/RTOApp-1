package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.roa  reason: case insensitive filesystem */
public final class C2528roa extends C2446qia implements C2387poa {
    C2528roa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    public final void Ua() {
        b(1, c());
    }

    public final void eb() {
        b(2, c());
    }

    public final void i(C1824hqa hqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) hqa);
        b(3, c2);
    }
}
