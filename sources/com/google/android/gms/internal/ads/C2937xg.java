package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.xg  reason: case insensitive filesystem */
public final class C2937xg extends C2446qia implements C2795vg {
    C2937xg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    public final void e(String str) {
        Parcel c2 = c();
        c2.writeString(str);
        b(3, c2);
    }
}
