package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Dg  reason: case insensitive filesystem */
public final class C0650Dg extends C2446qia implements C0598Bg {
    C0650Dg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    public final void e(String str) {
        Parcel c2 = c();
        c2.writeString(str);
        b(3, c2);
    }
}
