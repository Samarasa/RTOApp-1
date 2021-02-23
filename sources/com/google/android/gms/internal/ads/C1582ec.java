package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.ec  reason: case insensitive filesystem */
public abstract class C1582ec extends C2587sia implements C1653fc {
    public static C1653fc a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface instanceof C1653fc ? (C1653fc) queryLocalInterface : new C1795hc(iBinder);
    }
}
