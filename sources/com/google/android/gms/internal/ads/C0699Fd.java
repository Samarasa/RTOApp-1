package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Fd  reason: case insensitive filesystem */
public abstract class C0699Fd extends C2587sia implements C0621Cd {
    public C0699Fd() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static C0621Cd a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof C0621Cd ? (C0621Cd) queryLocalInterface : new C0673Ed(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        c(parcel.createTypedArrayList(C3002yd.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
