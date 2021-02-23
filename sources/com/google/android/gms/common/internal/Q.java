package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import c.b.b.b.d.c.a;

public abstract class Q extends a implements S {
    public static S a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof S ? (S) queryLocalInterface : new T(iBinder);
    }
}
