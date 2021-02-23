package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class Gra extends C2587sia implements Era {
    public Gra() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static Era a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof Era ? (Era) queryLocalInterface : new Fra(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i == 1) {
            str = Q();
        } else if (i != 2) {
            return false;
        } else {
            str = wa();
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}
