package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.sg  reason: case insensitive filesystem */
public final class C2582sg extends C2446qia implements C2441qg {
    C2582sg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    public final void e(String str) {
        Parcel c2 = c();
        c2.writeString(str);
        b(2, c2);
    }
}
