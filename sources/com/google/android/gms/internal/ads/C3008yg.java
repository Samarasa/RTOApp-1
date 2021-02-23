package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.yg  reason: case insensitive filesystem */
public final class C3008yg extends C2446qia implements C2866wg {
    C3008yg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    public final void e(String str) {
        Parcel c2 = c();
        c2.writeString(str);
        b(2, c2);
    }
}
