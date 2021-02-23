package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.Jb  reason: case insensitive filesystem */
public final class C0801Jb extends C2446qia implements C0749Hb {
    C0801Jb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public final a Mb() {
        Parcel a2 = a(9, c());
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final String W() {
        Parcel a2 = a(4, c());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final boolean w(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        Parcel a2 = a(10, c2);
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }
}
