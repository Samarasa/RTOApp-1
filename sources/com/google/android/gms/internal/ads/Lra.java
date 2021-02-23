package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class Lra extends C2587sia implements Mra {
    public Lra() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static Mra a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof Mra ? (Mra) queryLocalInterface : new Ora(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((C2603sqa) C2516ria.a(parcel, C2603sqa.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
