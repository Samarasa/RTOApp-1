package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

public final class Bra extends C2446qia implements C2960xra {
    Bra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final IBinder e(a aVar, int i) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        c2.writeInt(203404000);
        Parcel a2 = a(1, c2);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
