package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.hc  reason: case insensitive filesystem */
public final class C1795hc extends C2446qia implements C1653fc {
    C1795hc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public final boolean I(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        Parcel a2 = a(2, c2);
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }
}
