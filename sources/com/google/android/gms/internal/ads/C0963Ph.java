package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Ph  reason: case insensitive filesystem */
public abstract class C0963Ph extends C2587sia implements C0885Mh {
    public static C0885Mh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof C0885Mh ? (C0885Mh) queryLocalInterface : new C0937Oh(iBinder);
    }
}
