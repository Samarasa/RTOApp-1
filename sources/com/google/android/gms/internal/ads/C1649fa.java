package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.fa  reason: case insensitive filesystem */
public final class C1649fa extends C2446qia implements C1508da {
    C1649fa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void a(X x) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) x);
        b(1, c2);
    }
}
