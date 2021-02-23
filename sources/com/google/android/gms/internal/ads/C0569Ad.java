package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ad  reason: case insensitive filesystem */
public abstract class C0569Ad extends C2587sia implements C0595Bd {
    public C0569Ad() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static C0595Bd a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof C0595Bd ? (C0595Bd) queryLocalInterface : new C0647Dd(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            da();
        } else if (i != 3) {
            return false;
        } else {
            n(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
