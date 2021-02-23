package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Hf  reason: case insensitive filesystem */
public abstract class C0753Hf extends C2587sia implements C0675Ef {
    public C0753Hf() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static C0675Ef a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof C0675Ef ? (C0675Ef) queryLocalInterface : new C0727Gf(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        if (i == 1) {
            iInterface = j(parcel.readString());
        } else if (i == 2) {
            boolean m = m(parcel.readString());
            parcel2.writeNoException();
            C2516ria.a(parcel2, m);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            iInterface = x(parcel.readString());
        }
        parcel2.writeNoException();
        C2516ria.a(parcel2, iInterface);
        return true;
    }
}
