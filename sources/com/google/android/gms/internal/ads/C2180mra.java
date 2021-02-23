package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.mra  reason: case insensitive filesystem */
public abstract class C2180mra extends C2587sia implements C1967jra {
    public C2180mra() {
        super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    public static C1967jra a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof C1967jra ? (C1967jra) queryLocalInterface : new C2109lra(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        qa();
        parcel2.writeNoException();
        return true;
    }
}
