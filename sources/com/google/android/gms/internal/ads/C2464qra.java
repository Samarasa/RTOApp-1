package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.qra  reason: case insensitive filesystem */
public final class C2464qra extends C2446qia implements C2322ora {
    C2464qra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public final void a(String str, String str2) {
        Parcel c2 = c();
        c2.writeString(str);
        c2.writeString(str2);
        b(1, c2);
    }
}
