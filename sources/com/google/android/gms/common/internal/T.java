package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.b.x;
import c.b.b.b.c.a;
import c.b.b.b.d.c.b;
import c.b.b.b.d.c.c;

public final class T extends b implements S {
    T(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean a(x xVar, a aVar) {
        Parcel Db = Db();
        c.a(Db, (Parcelable) xVar);
        c.a(Db, (IInterface) aVar);
        Parcel a2 = a(5, Db);
        boolean a3 = c.a(a2);
        a2.recycle();
        return a3;
    }
}
