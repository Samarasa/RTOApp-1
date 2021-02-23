package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ob  reason: case insensitive filesystem */
public final class C0931Ob extends C2446qia implements C0879Mb {
    C0931Ob(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void a(C0645Db db) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) db);
        b(1, c2);
    }
}
