package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.dra  reason: case insensitive filesystem */
public final class C1542dra extends C2446qia implements C1613era {
    C1542dra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder a(a aVar, String str, C0675Ef ef, int i) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        c2.writeString(str);
        C2516ria.a(c2, (IInterface) ef);
        c2.writeInt(203404000);
        Parcel a2 = a(1, c2);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
