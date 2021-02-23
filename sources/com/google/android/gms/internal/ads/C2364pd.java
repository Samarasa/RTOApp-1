package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.pd  reason: case insensitive filesystem */
public final class C2364pd extends C2446qia implements C2435qd {
    C2364pd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void a(C2009kd kdVar, C2293od odVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) kdVar);
        C2516ria.a(c2, (IInterface) odVar);
        c(2, c2);
    }
}
