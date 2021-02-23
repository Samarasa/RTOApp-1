package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.noa  reason: case insensitive filesystem */
public final class C2245noa extends C2446qia implements C2103loa {
    C2245noa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public final void a(C1749goa goa) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) goa);
        b(1, c2);
    }

    public final void g(C1824hqa hqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) hqa);
        b(3, c2);
    }

    public final void i(int i) {
        Parcel c2 = c();
        c2.writeInt(i);
        b(2, c2);
    }
}
