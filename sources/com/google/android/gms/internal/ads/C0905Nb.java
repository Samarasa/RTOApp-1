package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Nb  reason: case insensitive filesystem */
public final class C0905Nb extends C2446qia implements C0853Lb {
    C0905Nb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void a(C2998yb ybVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) ybVar);
        b(1, c2);
    }
}
