package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Dd  reason: case insensitive filesystem */
public final class C0647Dd extends C2446qia implements C0595Bd {
    C0647Dd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public final void n(String str) {
        Parcel c2 = c();
        c2.writeString(str);
        b(3, c2);
    }
}
