package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.tj  reason: case insensitive filesystem */
public final class C2659tj extends C2446qia implements C2517rj {
    C2659tj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    public final void Aa() {
        b(1, c());
    }

    public final void f(C1824hqa hqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) hqa);
        b(3, c2);
    }

    public final void k(int i) {
        Parcel c2 = c();
        c2.writeInt(i);
        b(2, c2);
    }
}
