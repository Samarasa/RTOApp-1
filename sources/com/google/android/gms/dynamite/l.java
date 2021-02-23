package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;
import c.b.b.b.d.c.b;
import c.b.b.b.d.c.c;

public final class l extends b implements m {
    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final a a(a aVar, String str, int i, a aVar2) {
        Parcel Db = Db();
        c.a(Db, (IInterface) aVar);
        Db.writeString(str);
        Db.writeInt(i);
        c.a(Db, (IInterface) aVar2);
        Parcel a2 = a(2, Db);
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final a b(a aVar, String str, int i, a aVar2) {
        Parcel Db = Db();
        c.a(Db, (IInterface) aVar);
        Db.writeString(str);
        Db.writeInt(i);
        c.a(Db, (IInterface) aVar2);
        Parcel a2 = a(3, Db);
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
