package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Rd  reason: case insensitive filesystem */
public abstract class C1011Rd extends C2587sia implements C1037Sd {
    public static C1037Sd a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return queryLocalInterface instanceof C1037Sd ? (C1037Sd) queryLocalInterface : new C1063Td(iBinder);
    }
}
