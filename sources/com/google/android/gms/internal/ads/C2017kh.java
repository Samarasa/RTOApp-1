package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.kh  reason: case insensitive filesystem */
public final class C2017kh extends C2446qia implements C1875ih {
    C2017kh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public final void Za() {
        b(3, c());
    }

    public final void a(Intent intent) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) intent);
        b(1, c2);
    }

    public final void c(a aVar, String str, String str2) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        c2.writeString(str);
        c2.writeString(str2);
        b(2, c2);
    }
}
