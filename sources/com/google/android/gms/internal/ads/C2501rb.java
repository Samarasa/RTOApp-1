package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.rb  reason: case insensitive filesystem */
public final class C2501rb extends C2446qia implements C2360pb {
    C2501rb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public final void a(a aVar, int i) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        c2.writeInt(i);
        b(5, c2);
    }

    public final void a(C1793hb hbVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) hbVar);
        b(8, c2);
    }

    public final void a(String str, a aVar) {
        Parcel c2 = c();
        c2.writeString(str);
        C2516ria.a(c2, (IInterface) aVar);
        b(1, c2);
    }

    public final void c(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(6, c2);
    }

    public final void e(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(3, c2);
    }

    public final void g(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(7, c2);
    }

    public final a r(String str) {
        Parcel c2 = c();
        c2.writeString(str);
        Parcel a2 = a(2, c2);
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final void u(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(9, c2);
    }
}
