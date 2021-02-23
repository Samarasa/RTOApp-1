package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;
import c.b.b.b.d.c.b;
import c.b.b.b.d.c.c;

public final class j extends b implements k {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int a(a aVar, String str, boolean z) {
        Parcel Db = Db();
        c.a(Db, (IInterface) aVar);
        Db.writeString(str);
        c.a(Db, z);
        Parcel a2 = a(5, Db);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    public final a a(a aVar, String str, int i) {
        Parcel Db = Db();
        c.a(Db, (IInterface) aVar);
        Db.writeString(str);
        Db.writeInt(i);
        Parcel a2 = a(2, Db);
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final int b() {
        Parcel a2 = a(6, Db());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    public final int b(a aVar, String str, boolean z) {
        Parcel Db = Db();
        c.a(Db, (IInterface) aVar);
        Db.writeString(str);
        c.a(Db, z);
        Parcel a2 = a(3, Db);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    public final a b(a aVar, String str, int i) {
        Parcel Db = Db();
        c.a(Db, (IInterface) aVar);
        Db.writeString(str);
        Db.writeInt(i);
        Parcel a2 = a(4, Db);
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
