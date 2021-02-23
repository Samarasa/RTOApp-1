package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Jh  reason: case insensitive filesystem */
public final class C0807Jh extends C2587sia implements C0833Kh {
    public static C0833Kh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof C0833Kh ? (C0833Kh) queryLocalInterface : new C0911Nh(iBinder);
    }
}
