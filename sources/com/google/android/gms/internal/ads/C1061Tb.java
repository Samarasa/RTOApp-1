package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Tb  reason: case insensitive filesystem */
public final class C1061Tb extends C2446qia implements C1009Rb {
    C1061Tb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void a(C0749Hb hb, String str) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) hb);
        c2.writeString(str);
        b(1, c2);
    }
}
