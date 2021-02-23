package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Qi  reason: case insensitive filesystem */
public final class C0990Qi extends C2446qia implements C0912Ni {
    C0990Qi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void a(C0886Mi mi, String str, String str2) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) mi);
        c2.writeString(str);
        c2.writeString(str2);
        b(2, c2);
    }
}
