package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.Ah  reason: case insensitive filesystem */
public final class C0573Ah extends C2446qia implements C2939xh {
    C0573Ah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    public final IBinder r(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        Parcel a2 = a(1, c2);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
