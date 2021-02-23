package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.ac  reason: case insensitive filesystem */
public final class C1299ac extends C2446qia implements C1217Zb {
    C1299ac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public final void a(C1755gra gra, a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) gra);
        C2516ria.a(c2, (IInterface) aVar);
        b(1, c2);
    }
}
