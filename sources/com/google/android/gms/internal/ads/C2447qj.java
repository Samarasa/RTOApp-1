package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.qj  reason: case insensitive filesystem */
public final class C2447qj extends C2446qia implements C2376pj {
    C2447qj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final void Da() {
        b(2, c());
    }

    public final void Ia() {
        b(1, c());
    }

    public final void a(C1950jj jjVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) jjVar);
        b(3, c2);
    }

    public final void h(C1824hqa hqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) hqa);
        b(5, c2);
    }

    public final void m(int i) {
        Parcel c2 = c();
        c2.writeInt(i);
        b(4, c2);
    }
}
