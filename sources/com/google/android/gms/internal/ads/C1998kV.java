package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.kV  reason: case insensitive filesystem */
public abstract class C1998kV extends C2587sia implements C2069lV {
    public static C2069lV a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        return queryLocalInterface instanceof C2069lV ? (C2069lV) queryLocalInterface : new C2140mV(iBinder);
    }
}
