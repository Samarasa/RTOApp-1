package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.cc  reason: case insensitive filesystem */
public final class C1441cc extends C2446qia implements C1243_b {
    C1441cc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void a(C2007kc kcVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) kcVar);
        b(1, c2);
    }
}
