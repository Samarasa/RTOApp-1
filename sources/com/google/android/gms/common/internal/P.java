package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.d.c.a;
import c.b.b.b.d.c.c;

public abstract class P extends a implements N {
    public P() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static N a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof N ? (N) queryLocalInterface : new O(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            c.b.b.b.c.a b2 = b();
            parcel2.writeNoException();
            c.a(parcel2, (IInterface) b2);
        } else if (i != 2) {
            return false;
        } else {
            int l = l();
            parcel2.writeNoException();
            parcel2.writeInt(l);
        }
        return true;
    }
}
