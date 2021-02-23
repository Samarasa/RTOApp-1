package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.kra  reason: case insensitive filesystem */
public final class C2038kra extends C2446qia implements C1826hra {
    C2038kra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder a(a aVar, C2462qqa qqa, String str, C0675Ef ef, int i, int i2) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (Parcelable) qqa);
        c2.writeString(str);
        C2516ria.a(c2, (IInterface) ef);
        c2.writeInt(203404000);
        c2.writeInt(i2);
        Parcel a2 = a(2, c2);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
