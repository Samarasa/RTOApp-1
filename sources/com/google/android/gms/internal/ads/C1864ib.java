package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.ib  reason: case insensitive filesystem */
public final class C1864ib extends C2446qia implements C1793hb {
    C1864ib(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public final a Qa() {
        Parcel a2 = a(4, c());
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
