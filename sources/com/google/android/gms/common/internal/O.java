package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import c.b.b.b.c.a;
import c.b.b.b.d.c.b;

public final class O extends b implements N {
    O(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final a b() {
        Parcel a2 = a(1, Db());
        a a3 = a.C0060a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final int l() {
        Parcel a2 = a(2, Db());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }
}
