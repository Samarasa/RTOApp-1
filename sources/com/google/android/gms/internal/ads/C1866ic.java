package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ic  reason: case insensitive filesystem */
public final class C1866ic extends C2446qia implements C1724gc {
    C1866ic(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    public final void Sb() {
        b(2, c());
    }

    public final void s(String str) {
        Parcel c2 = c();
        c2.writeString(str);
        b(1, c2);
    }
}
