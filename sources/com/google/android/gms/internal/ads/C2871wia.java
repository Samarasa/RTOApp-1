package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.wia  reason: case insensitive filesystem */
public abstract class C2871wia extends C2587sia implements C2658tia {
    public static C2658tia a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof C2658tia ? (C2658tia) queryLocalInterface : new C2729uia(iBinder);
    }
}
