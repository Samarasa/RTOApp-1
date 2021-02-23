package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.ara  reason: case insensitive filesystem */
public final class C1330ara extends C2446qia implements Yqa {
    C1330ara(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final void a(C2249nqa nqa, int i) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) nqa);
        c2.writeInt(i);
        b(5, c2);
    }

    public final void b(C2249nqa nqa) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) nqa);
        b(1, c2);
    }

    public final boolean q() {
        Parcel a2 = a(3, c());
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }
}
