package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.gi  reason: case insensitive filesystem */
public final class C1736gi extends C2446qia implements C1524di {
    C1736gi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final void a(C2515ri riVar, C2090li liVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) riVar);
        C2516ria.a(c2, (IInterface) liVar);
        b(4, c2);
    }

    public final void a(String str, C2090li liVar) {
        Parcel c2 = c();
        c2.writeString(str);
        C2516ria.a(c2, (IInterface) liVar);
        b(7, c2);
    }

    public final void b(C2515ri riVar, C2090li liVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) riVar);
        C2516ria.a(c2, (IInterface) liVar);
        b(6, c2);
    }

    public final void c(C2515ri riVar, C2090li liVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) riVar);
        C2516ria.a(c2, (IInterface) liVar);
        b(5, c2);
    }
}
