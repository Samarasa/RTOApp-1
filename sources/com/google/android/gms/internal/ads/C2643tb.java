package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.tb  reason: case insensitive filesystem */
public final class C2643tb extends C2446qia implements C2431qb {
    C2643tb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    public final IBinder a(a aVar, a aVar2, a aVar3, int i) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (IInterface) aVar2);
        C2516ria.a(c2, (IInterface) aVar3);
        c2.writeInt(203404000);
        Parcel a2 = a(1, c2);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
