package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Yb  reason: case insensitive filesystem */
public abstract class C1191Yb extends C2587sia implements C1217Zb {
    public static C1217Zb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof C1217Zb ? (C1217Zb) queryLocalInterface : new C1299ac(iBinder);
    }
}
