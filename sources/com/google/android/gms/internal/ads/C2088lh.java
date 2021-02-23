package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.lh  reason: case insensitive filesystem */
public abstract class C2088lh extends C2587sia implements C1875ih {
    public C2088lh() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static C1875ih a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof C1875ih ? (C1875ih) queryLocalInterface : new C2017kh(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a((Intent) C2516ria.a(parcel, Intent.CREATOR));
        } else if (i == 2) {
            c(a.C0060a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            Za();
        }
        parcel2.writeNoException();
        return true;
    }
}
