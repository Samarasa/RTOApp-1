package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Bo  reason: case insensitive filesystem */
public abstract class C0606Bo extends C2587sia implements C0632Co {
    public static C0632Co a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof C0632Co ? (C0632Co) queryLocalInterface : new C0658Do(iBinder);
    }
}
