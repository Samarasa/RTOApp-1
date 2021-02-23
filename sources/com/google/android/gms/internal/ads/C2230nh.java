package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.nh  reason: case insensitive filesystem */
public abstract class C2230nh extends C2587sia implements C2301oh {
    public static C2301oh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return queryLocalInterface instanceof C2301oh ? (C2301oh) queryLocalInterface : new C2372ph(iBinder);
    }
}
