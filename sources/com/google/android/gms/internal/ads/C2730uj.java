package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.uj  reason: case insensitive filesystem */
public final class C2730uj extends C2446qia implements C2588sj {
    C2730uj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void a(C1950jj jjVar, String str, String str2) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) jjVar);
        c2.writeString(str);
        c2.writeString(str2);
        b(2, c2);
    }
}
