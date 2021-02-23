package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class Joa extends C2446qia implements Goa {
    Joa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long a(Foa foa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) foa);
        Parcel a2 = a(3, c2);
        long readLong = a2.readLong();
        a2.recycle();
        return readLong;
    }

    public final Aoa b(Foa foa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) foa);
        Parcel a2 = a(1, c2);
        Aoa aoa = (Aoa) C2516ria.a(a2, Aoa.CREATOR);
        a2.recycle();
        return aoa;
    }

    public final Aoa c(Foa foa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) foa);
        Parcel a2 = a(2, c2);
        Aoa aoa = (Aoa) C2516ria.a(a2, Aoa.CREATOR);
        a2.recycle();
        return aoa;
    }
}
