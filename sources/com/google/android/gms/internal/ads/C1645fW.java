package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.fW  reason: case insensitive filesystem */
public final class C1645fW extends C2446qia implements C1433cW {
    C1645fW(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final C1291aW a(ZV zv) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) zv);
        Parcel a2 = a(1, c2);
        C1291aW aWVar = (C1291aW) C2516ria.a(a2, C1291aW.CREATOR);
        a2.recycle();
        return aWVar;
    }

    public final C2070lW a(C1928jW jWVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) jWVar);
        Parcel a2 = a(3, c2);
        C2070lW lWVar = (C2070lW) C2516ria.a(a2, C2070lW.CREATOR);
        a2.recycle();
        return lWVar;
    }

    public final void a(YV yv) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) yv);
        b(2, c2);
    }
}
